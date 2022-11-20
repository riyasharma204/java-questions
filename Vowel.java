import java.lang.String;
import java.util.Scanner;

class Vowel{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
char ch;
System.out.println("Enter the alphabet:");
ch = sc.next().charAt(0);
if(ch == 'a' || ch == 'i' || ch == 'o' || ch == 'u')
System.out.println("The character is vowel:");
else
System.out.println("It is consonent");
}
}