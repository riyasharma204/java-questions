import java.util.Scanner;
import java.lang.String;


class DeleteVowel{
public static void main(String args[]){
 
StringBuffer sc = new StringBuffer();
System.out.println("Enter the string:");

String str = sc.nextLine();
str = str.replace("[aeiouAEIOU]", "");

System.out.println(str);
}
}

