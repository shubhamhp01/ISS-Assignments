//COLLECTION COMPARABLE 

package classroom;

import java.util.ArrayList;
import java.util.Collections;

class Student implements Comparable<Student> {
int rollno;
String name;
int age;

Student(int rollno, String name, int age) {
this.rollno = rollno;
this.name = name;
this.age = age;
}
Student()
{
}
public int compareTo(Student s) {
return this.rollno - s.rollno;
}
public void display()
{
System.out.println("RollNo- "+rollno+"\n"+"Name "+name+"\n"+"Age "+age+"\n");
}

public static void main(String args[]) {
ArrayList<Student> al = new ArrayList<Student>();
al.add(new Student(110, "Vijay", 23));
al.add(new Student(106, "Ajay", 27));
al.add(new Student(105, "Jai", 21));

System.out.println("Sorting by Name");
Collections.sort(al);
for (Student st : al) {
System.out.println(st.rollno + " " + st.name + " " + st.age);
}

}
}