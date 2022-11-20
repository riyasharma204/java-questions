import java.util.Scanner;
import java.lang.String;

public class Del_vowel{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Riya Sharma , CE-32");
        System.out.print("Enter the string: ");
        String s = sc.nextLine();
        sc.close();
        StringBuffer str = new StringBuffer();
        str.append(s.toLowerCase());

        char[] vowel = {'a','e','i','o','u'};
        for (int i = 0; i < str.length(); i++) {
            for (char character : vowel) {
                if(str.charAt(i)==character){
                    str.deleteCharAt(i);
                }
            }
        }
        System.out.println(str);
    }
}

