import java.util.*;
import java.lang.String;

class LCM{
public static void main(String args[]){
int n1 = 36 , n2 = 60;
int lcm , gcd = 1; 

for(int i=1 ; i<=n1 && i<=n2   ; i++){
if (n1%i ==0 && n2%i ==0 )
 gcd = i;
}
lcm = (n1*n2)/gcd;
System.out.println("The lcm is:"+lcm);
}
}