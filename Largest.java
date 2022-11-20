import java.util.Scanner;
import java.lang.String;

class Largest{
public static void main(String args[]){

Scanner sc = new Scanner(System.in);
System.out.println("Enter the three no.s:");
 int n1 = sc.nextInt();
 int n2 = sc.nextInt();
 int n3 = sc.nextInt();

if(n1>=n2 && n1>=n3)
System.out.println("The n1 is greatest");
else if(n2 >=n1 && n2>= n3)
System.out.println("The n2 is greatest");
else
System.out.println("The n3 is greatest");
}
}