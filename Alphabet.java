import java.util.Scanner;
 

class Aplhabet{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
char ch = '*';
System.out.println("Enter the character");
ch = sc.next().charAt(0);
if(ch>='a' && ch<='z' || ch>='A' && ch<='B')
System.out.println("Character is alphabet"+ch);

else
System.out.println("Not aplhabet");
}
}