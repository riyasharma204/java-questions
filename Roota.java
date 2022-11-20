import java.util.Scanner;
import java.lang.String;

class Roota{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);

System.out.println("Enter the value of a , b ,c:");
double a = sc.nextDouble();
double b = sc.nextDouble();
double c = sc.nextDouble();

double determinent;
determinent = b*b-4*a*c;

if(determinent > 1){
 double root1 = (-b + Math.sqrt(determinent))/(2*a);
 double root2 = (-b - Math.sqrt(determinent))/(2*a);
System.out.format("root1 = %.2f and root2 = %.2f",root1 , root2);
}

else if(determinent == 0){
 root1=root2 = -b/(2*a);
System.out.format("root1 = root2 = %.2f",root1);
}

else if(determinent < 0){
 double real = -b/(2*a);
 double imaginery = Math.sqrt(determinent)/(2*a);
System.out.format("real = %.2f and imaginery = %.2f",real , imaginery);
}
}
}