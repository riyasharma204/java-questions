import java.util.Scanner;
import java.lang.String;

class LeapYear{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
int year;
System.out.println("Enter the year");
year = sc.nextInt();

if(year%4==0){
System.out.println("This is leap year"+year);
}

else if(year%100==0){
System.out.println("This is leap year"+year);
}

else if(year%400 ==0){
System.out.println("This is leap year"+year);
}
else{
System.out.println("Not leap year");
}
}
}
