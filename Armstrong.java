import java.util.Scanner;
import java.lang.String;

class ArmStrong{
public static void main(String args[]);
int result , sum=0;
int armstrong ;
int n = 153;
 
armstrong = n;
while(n!=0){
result = n%10;
sum = sum+Math.pow(result , 3);
n = n/10;
}

if (armstrong == sum){
System.out.println("Armstrong number");
}
else {
System.out.println("Not Armstrong number");
}
}
}