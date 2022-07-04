//Loop Control,Decision Making,Strings,Arrays

package bank;

import java.util.*;

public class CustomerNames {
public static void main(String args[]) {
System.out.println("Enter names");
Scanner sc = new Scanner(System.in);   
String names[] = new String[10];
for (int i = 0; i < 10;) {
String temporary = sc.next();
if (temporary.length() < 4)   //Length of string should be more than 4 else it will not consider it as an input
continue;
names[i] = temporary;
i++;
}
int i, j;
String temp;
boolean swapped;
for (i = 0; i < 9; i++) {					//bubble sort
swapped = false;
for (j = 0; j < 10- i - 1; j++) {
if (names[j].compareTo(names[j+1])>0) {
temp = names[j];								
names[j] = names[j+1];
names[j+1] = temp;
swapped = true;
}
}

if (swapped == false)
break;
}
System.out.println("Displaying sorted names");
for(i=0;i<9;i++)
{
System.out.println(names[i]);
}
}
}