package ExceptionHandle;


import java.util.Scanner;
public class ExceptionHandle {

public static void main(String args[]) {
try {

System.out.println("Inside try block trying to divide a number by 0");
int data = 25 / 0;
System.out.println(data);
}
catch (ArithmeticException e) {
System.out.println("Exception handled");
System.out.println(e);
}

finally {
System.out.println("finally block is always executed");
}

System.out.println("Enter the smallest prime number");
try {
input();
}
catch(Exception e)
{
System.out.println(e);
System.out.println("Number entered is wrong");
}
}
static void input() throws Exception
{
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
if(num!=2) {
sc.close();
throw new Exception();
}
else
System.out.println("Number entered in valid");
sc.close();
}
}
