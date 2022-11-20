import java.util.Scanner;
import java.lang.String;

class Check{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
int min , max;
 int i , j , count;
System.out.println("Enter minimum value");
min = sc.nextInt();
System.out.println("Enter the maximum value");
max = sc.nextInt();

for( i=min ; i<=max ; i++){
 count = 0;

for( j=1 ; j<=min ; j++){
if(i%j == 0){
 count++;
}
}

if(count==2){
System.out.println(i);
}
}
}
}