import java.util.Scanner;
public class Replaceone
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Program made by Riya Sharma CE-32");	
		System.out.print("Enter the number : ");		
		int number = sc.nextInt();
		String str = Integer.toString(number);
		int len = str.length();
		String str1 = "";
		for(int i = 0 ; i < len ; i++)
		{
			if(str.charAt(i) == '0')
				str1 = str1 + '1';
			else
				str1 = str1 + str.charAt(i);	
		}
		System.out.println("Converted number is: "+str1);									
	}
}