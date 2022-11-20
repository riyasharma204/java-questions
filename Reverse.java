import java.lang.String;
import java.util.Scanner;
 
class Reverse{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
String name , reverse="";
System.out.println("Enter the string to be reversed");
name = sc.nextLine();
int length = name.length();
 
for(int i = length-1 ; i>=0 ; i--){
reverse = reverse + name.length();
System.out.println("The reverse string is:"+reverse);
}
}
if (name.length() < 5)
{
String lstring = name.toLowerCase();
System.out.println(lstring);
}

if ( name.length() > 5 && name.length() < 10){
String Ustring = name.toUpperCase();
System.out.println(Ustring);
}
}
}

