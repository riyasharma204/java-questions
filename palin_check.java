import java.util.*;
import java.lang.String;

public class palin_check{
public static booleanpalin(String s){
int low = 0, high;

high = s.length()-1;
while(low<high){
if(s.charAt(low)!=s.charAt(high)){
return false;
}
low++;
high--;
}
return true;
}

public static void main(String args[]){
BufferedReader br = null;
int count=0;

try{
br = new BufferedReader(new FileReader("C:\Users\91985\OneDrive\Desktop\java"));
 String s = br.readLine();
 String arrstr[]=s.split(" ");
 for(String str:arrstr){
count++;
}
}
}
catch(FileNotException e){
System.out.println("File not found");
}
catch(IOException e){
System.out.println("IOException");
}
System.out.println("Number of palindrome in thr file:"+count);
}
}