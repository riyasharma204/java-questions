import java.io.*;
import java.lang.String;
public class palindrome_check {
 public static boolean palin(String s) {
 int low=0,high;
 high=s.length()-1;
 while(low<high) {
 if(s.charAt(low)!=s.charAt(high)) {
 return false;
 }
 low++;
 high--;
 }
 return true;
 }
 public static void main(String args[])
 {
 BufferedReader br=null;
 int count=0;
 try {
 br = new BufferedReader(new
FileReader("C:\\Users\\ridha\\Desktop\\mytext.txt"));
 String s=br.readLine();
 String arrstr[]=s.split(" ");
 for(String str:arrstr) {
 if(palin(str)) {
 count++;
 } }
 } catch (FileNotFoundException e) {
 System.err.println("NO FILE FOUND");
 } catch (IOException e) {
 System.out.println("IOEXCEOTION"); }
 System.out.println("Number of Palindromes in the file: "+count);
 }
} 
