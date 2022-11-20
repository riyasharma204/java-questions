import java.util.Scanner;
import java.lang.String;

class Pattern{
 public static void main(String []arg)
 {
 System.out.println("Riya Sharma_CE-32");
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter the string");
 String st=sc.next();
 int i=0;
 int j=0;
 int count=0;
 while(i<st.length()-1 ){
 if(st.charAt(i)=='0')
 {
 j=i+1;
 if( st.charAt(j)=='0')
 {
 i++;

 }
 else
 {
 while(j<st.length() && st.charAt(j) != '0')
 {
 j++;
 }
 count++;
 i=j;
 }
 }
 else
 {
 i++;
 }
}
if(st.charAt(st.length()-1)=='1')
count--;
System.out.println("Total pattern : " +count);
 }
} 