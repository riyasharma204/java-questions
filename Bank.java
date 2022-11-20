 import java.util.Scanner;
import java.lang.String;
class Bank {
 public int accno = 1000;
 public String name;
 public long balance;
 public String Address;
 Scanner sc = new Scanner(System.in);

 // method to open new account
 public void openAccount() {
 System.out.println("Your account is created and Your account no. is : " + accno);
 System.out.print("Enter Name: ");
 name = sc.next();
 System.out.print("Enter Balance: ");
 balance = sc.nextLong();
 System.out.print("Enter Address : ");
 Address = sc.next();
 }
 // method to display account details
 public void showAccount() {
 System.out.println("Name of account holder: " + name);
 System.out.println("Account no.: " + accno);
 System.out.println("Balance: " + balance);
 System.out.println("Address: " + Address);
 }
 // method to deposit money
 public void deposit() {
 long amt;
 System.out.println("Enter the amount you want to deposit: ");
 amt = sc.nextLong();
 balance = balance + amt;
 }
 // method to withdraw money
 public void withdrawal() {
 long amt;
 System.out.println("Enter the amount you want to withdraw: ");
 amt = sc.nextLong();
 if (balance >= amt) {
 balance = balance - amt;
 System.out.println("Balance after withdrawal: " + balance);
 } else {
 System.out.println("Your balance is less than " + amt + "\n Transaction failed!!");
 }
 }
 // method to search an account number
 public boolean search(int ac_no) {
 if (accno == ac_no) {
 // showAccount();
 return true;
 }
 return false;
 }
 public void ChangeAddress(String Add) {
 this.Address = Add;
 System.out.println("Updated Details : ");
 showAccount();
 }
}
class Main {
 public static void main(String args[]) {
 Scanner sc = new Scanner(System.in);
 System.out.println("Riya Sharma , CE- 18");
 // create initial accounts
 System.out.print("Number of customers :");
 int n = sc.nextInt();
 Bank arr[] = new Bank[n];
 for (int i = 0; i < arr.length; i++) {
 arr[i] = new Bank(); // null pointer exception.
 arr[i].accno = arr[i].accno + i;
 arr[i].openAccount();
 }
 // loop runs until number 6 is not pressed to exit
 int ch;
 do {
 System.out.println("1. Display all account details \n 2. Search by Account number\n 3. Deposit the amount \n 4. Withdraw the amount \n 5.Change Address \n 6.Exit. ");
 System.out.println("Enter your choice: ");
 ch = sc.nextInt();
 switch (ch) {
 case 1:
 for (int i = 0; i < arr.length; i++) {
 arr[i].showAccount();
 }
 break;
 case 2:
 System.out.print("Enter account no. you want to search: ");
 int ac_no = sc.nextInt();
 boolean found = false;
 for (int i = 0; i < arr.length; i++) {
 found = arr[i].search(ac_no);
 if (found) {
 break;
 }
 }
 if (!found) {
 System.out.println("Search failed! Account doesn't exist!!");
 }
 break;
 case 3:
 System.out.print("Enter Account no. : ");
 ac_no = sc.nextInt();
 found = false;
 for (int i = 0; i < arr.length; i++) {
 found = arr[i].search(ac_no);
 if (found) {
 arr[i].deposit();
 break;
 }
 }
 if (!found) {
 System.out.println("Search failed! Account doesn't exist!!");
 }
 break;
 case 4:
 System.out.print("Enter Account No : ");
 ac_no = sc.nextInt();
 found = false;
 for (int i = 0; i < arr.length; i++) {
 found = arr[i].search(ac_no);
 if (found) {
 arr[i].withdrawal();
 break;
 }
 }
 if (!found) {
 System.out.println("Search failed! Account doesn't exist!!");
 }
 break;
 case 5:
 System.out.print("Enter Account No. : ");
 ac_no = sc.nextInt();
 found = false;
 for (int i = 0; i < arr.length; i++) {
 found = arr[i].search(ac_no);
 if (found) {
 System.out.println("Enter new address :");
 String add = sc.next();
 arr[i].ChangeAddress(add);
 break;
 }
 }
 if (!found) {
 System.out.println("Search failed! Account doesn't exist!!");
 }
 break;
 case 6:
 System.out.println("Please visit again.");
 break;
 }
 } while (ch != 6);
 }
} 