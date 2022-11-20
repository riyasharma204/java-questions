import java.util.Scanner;
import java.lang.String;

class PrimeN{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
int n , count = 0;

System.out.println("Enter the number:");
n = sc.nextInt();

for(int i = 1 ; i <= n ; i++){
if(n%i==0){
count++;
}
}
if(count == 2 ){
System.out.println("Prime no.");
}
else
System.out.println("Not prime no.");
}
}
}