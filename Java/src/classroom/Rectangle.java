//METHOD OVERLOADING 

package classroom;


import java.util.Scanner;
interface Polygon {
void getArea(int length, int breadth);
}

public class Rectangle implements Polygon {

public void getArea(int length, int breadth) {
System.out.println("The area of the rectangle is " + (length * breadth));
}
public void getArea() {
Scanner sc=new Scanner(System.in);
System.out.println("Enter lenght of square");
int length=sc.nextInt();
System.out.println("The area of square is "+(length*length));
sc.close();
}
public static void main(String args[])
{
Rectangle ob=new Rectangle();
ob.getArea();
ob.getArea(3,2);
}
}