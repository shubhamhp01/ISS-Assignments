//FILE READ AND WRITE

package Fileop;

import java.io.*;

public class FileWrite {

	public static void main(String args[])
	{
	try {
	PrintWriter fos=new PrintWriter(new BufferedWriter(new FileWriter("C:\\Users\\shubh\\OneDrive\\Desktop\\info.txt",true)));
	fos.println("My name is sp");
	for(int i=0;i<10;i++)
	fos.println(i);
	System.out.println("created");
	fos.close();
	System.out.println("Reading the data");
	BufferedReader fs=new BufferedReader(new FileReader("C:\\Users\\shubh\\OneDrive\\Desktop\\info.txt"));
	while(true)
	{
	String s=fs.readLine();
	if(s==null)
	break;
	System.out.println(s);
	}
	fs.close();
	}
	catch(Exception e)
	{
	System.out.println(e);
	}
	}
}
