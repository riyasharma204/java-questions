import java.lang.*;
import java.lang.String;

class Multi1 extends Thread {
 int ITcnt = 1;
 public void run() {
 currentThread().setName("ITThread");
 for (int i = 1; i <=4; i++) {
 System.out.println(currentThread().getName() +" Thread is running :" + ", Count of occurence : "+(ITcnt++));
 try {
 currentThread().sleep(500);
 } catch (InterruptedException ex) {
 System.out.println("An exception occurred");
 }
 }
 }
}
class Multi2 extends Thread {
 int Cscnt = 1;
 public void run() {
 currentThread().setName("CSThread");
 for (int i = 1; i <=4; i++) {
 System.out.println(currentThread().getName() +" Thread is running :" + ", Count of occurence : "+(Cscnt++));
 try {
 currentThread().sleep(500);
 } catch (InterruptedException ex) {
 System.out.println("An exception occurred");
 }
 }
 }
}
public class Term19{
 public static void main(String args[]) {
 Multi1 IT = new Multi1();
 Multi2 CS = new Multi2();
 IT.start();
 CS.start();
 }
}












