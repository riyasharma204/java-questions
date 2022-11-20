import java.util.Scanner;
import java.lang.String;

class Positive{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
int n ;
System.out.println("Enter the number"); 
n = sc.nextInt();

if(n > 0){
System.out.println("The no. is positive"+n);
}

else if(n < 0){
System.out.println("The no. is negative"+n);
}
}
}