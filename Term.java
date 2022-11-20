import java.util.Scanner;

public class Term{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("Program made by Aryamann Singh , CE: 18");
System.out.println("Enter 1 for Term Deposit or Enter 2 for Recurring Deposit");
int choice = sc.nextInt();
switch(choice){

case 1:
System.out.println("Enter the Principal Amount");
double p1 = sc.nextDouble();
System.out.println("Enter Rate of Interest");
double r1 = sc.nextDouble();
System.out.println("Enter Time in years");
double n1 = sc.nextDouble();
double a1 = p1*(Math.pow(1+(0.01*r1),n1));
System.out.println("The Maturity amount is:"+a1);
break;

case 2:
System.out.println("Enter the Monthly Installment");
double p2 = sc.nextDouble();
System.out.println("Enter Rate of interest");
double r2 = sc.nextDouble();
System.out.println("Enter Time in months");
double n2 = sc.nextDouble();
double a2 = (((p2*n2)+(p2*n2*n2+p2*n2))*r2)/2400;
System.out.println("The Maturity amount is:"+a2);
break;
default:
System.out.println("Invalid choice");
}
}
}
