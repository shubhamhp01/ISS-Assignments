//JDBC CONNECTION

package DBDemo;

import java.sql.*;


public class DBDemo {
		public static void main (String[] args) throws Exception {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/users","root","password123");
			
			Statement st=con.createStatement();
			ResultSet rs= st.executeQuery("select * from user");
			
			while(rs.next()){
			int id= rs.getInt("id");
			String uname = rs.getString("uname");
			String upwd = rs.getString("upwd");
			String uemail = rs.getString("uemail");
			
			System.out.println(id+ " " +uname + " " +upwd +" "+uemail);
			}
			st.close();
			con.close();
			
		}
}
