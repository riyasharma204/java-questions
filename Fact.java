import java.util.Scanner;
import java.lang.String;

class Fact{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("Enter the number");
int n = sc.nextInt();
int i , factorial=1;

for(i=1 ; i<=n ; i++){
factorial = factorial*i;
}
System.out.println("The factorial is"+factorial);
}
}