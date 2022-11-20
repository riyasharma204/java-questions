import java.util.Scanner;
import java.lang.String;

class Integer{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("Enter the integer value:");
int num = sc.nextInt();

int count=0;

while(num!=0){
num = num/10;
count++;
}
System.out.println("The digits of integer is:"+count);
}
}