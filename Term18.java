import java.io.*;
import java.util.*;
import java.lang.String;

public class Term18 {
    public static boolean palindrome(String str) {
        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--)
            rev = rev + str.charAt(i);
        if (rev.equals(str))
            return true;
        return false;
    }

    public static void main(String args[]) {
        int count = 0;
        try {
            Scanner input = new Scanner(System.in);
            FileReader fil= new FileReader("D:myText.txt");
            BufferedReader string = new BufferedReader(file);
            String s1;
            while ((s1 = string.readLine()) != null) {
                String[] arrOfString = s1.split(" ");
                for (String a : arrOfString) {
                    if (palindrome(a)) {
                        System.out.println(a+" is a palindrome word.");
                        count++;
                    }
                }
            }
        } catch (IOException err) {
            System.out.println("An Error occured :" + err.getMessage());
        }
        System.out.println("Number of palindrome word in file :" + count);
    }
}





















