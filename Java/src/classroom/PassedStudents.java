//INTERFACE CODE

package classroom;

public class PassedStudents extends Student {
PassedStudents(int roll,int age,String name)
{
this.rollno=roll;
this.age=age;
this.name=name;
}
PassedStudents()
{
super(23,"shubham",12);
}
public static void main(String args[]) {
PassedStudents ob=new PassedStudents();
ob.display();
PassedStudents ob2=new PassedStudents(42,12,"riddham");
ob2.display();
}
}
