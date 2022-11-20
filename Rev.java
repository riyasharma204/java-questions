import java.util.*;
import java.lang.String;

class Rev{
public static void main(String args[]){
int num = 34879 , rev = 0;
int rem;

while(num!=0){
rem = num%10;
rev = rev*10+rem;
num = num/10;
}
System.out.println("The reverse no. is:"+rev);
}
}