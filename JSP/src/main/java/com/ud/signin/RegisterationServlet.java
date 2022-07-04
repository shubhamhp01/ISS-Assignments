package com.ud.signin;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/register")
public class RegisterationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String uname = request.getParameter("name");
		String uemail = request.getParameter("email");
		String upwd = request.getParameter("re_pass");
		String reupwd = request.getParameter("pass");
		
		RequestDispatcher dispatcher = null;
		Connection con = null;
		
		if(uname== null || uname.equals("")) {
			request.setAttribute("status", "invalidName");
			dispatcher = request.getRequestDispatcher("login.jsp");
			dispatcher.forward(request, response);
		}
		if(uemail== null || uemail.equals("")) {
			request.setAttribute("status", "invalidEmail");
			dispatcher = request.getRequestDispatcher("login.jsp");
			dispatcher.forward(request, response);
		}	
		if(upwd== null || upwd.equals("")) {
			request.setAttribute("status", "invalidUpwd");
			dispatcher = request.getRequestDispatcher("login.jsp");
			dispatcher.forward(request, response);
		} else if(!upwd.equals(reupwd)) {
			request.setAttribute("status", "invalidConfirmPassword");
			dispatcher = request.getRequestDispatcher("login.jsp");
			dispatcher.forward(request, response);	
		}
		  String regex = "^(?=.*[0-9])"
                  + "(?=.*[a-z])(?=.*[A-Z])"
                  + "(?=.*[@#$%^&+=])"
                  + "(?=\\S+$).{8,20}$";

		  // Compile the ReGex
		  Pattern p = Pattern.compile(regex);
		  Matcher m = p.matcher(upwd);
		  if(!m.matches()) {
				request.setAttribute("status", "pwdnotMatch");
				dispatcher = request.getRequestDispatcher("registration.jsp");
				dispatcher.forward(request, response);
		  }
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/users?useSSL=false","root","password123");
			
			
			PreparedStatement pst2= con.prepareStatement("select * from user where uemail= ?");
			pst2.setString(1, uemail);
	
			ResultSet rs = pst2.executeQuery();
			if(rs.next()) {
				request.setAttribute("status", "emailAlreadyExists");
				dispatcher = request.getRequestDispatcher("login.jsp");
				dispatcher.forward(request, response);
			}
			else
			{	
			PreparedStatement pst= con.prepareStatement("insert into user(uname,upwd,uemail) values(?,?,?)");
			pst.setString(1, uname);
			pst.setString(2, upwd);
			pst.setString(3, uemail);
			
			int rowCount = pst.executeUpdate();
			dispatcher = request.getRequestDispatcher("registration.jsp");
			if(rowCount > 0) {
				request.setAttribute("status", "success");
			}else {
				request.setAttribute("status", "failed");
			}
			dispatcher.forward(request, response);
			} 
		}catch(Exception e) {
				e.printStackTrace();
		}
		finally {
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
