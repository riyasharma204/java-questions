import java.lang.String;
import java.util.Scanner;

class Palin{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
int num , rem ;
int reverse = 0;
System.out.println("Enter the number");
num = sc.nextInt();
int originalnum = num;

while(num!=0){
rem = num %10;
reverse = reverse*10+rem;
num = num/10;
}
if (originalnum == reverse){
System.out.println(originalnum+" The no. is palindrome");
}
else{
System.out.println(originalnum+" Not a palindrome" );
}
}
}