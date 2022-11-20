import java.util.Scanner;
import java.lang.String;
import java.lang.Exception;

class myException extends Exception{
	public myException(String str) {
		super(str);
	}
	
}

public class Term16 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		try
		{
			System.out.println("Enter the employee name:");
			String name = sc.nextLine();
			if(!(name.charAt(0)>=65)&& (name.charAt(0)<=91)) 
				throw new myException ("The first letter should be in upper case\n");
			
			System.out.println("Enter the employee Id:");
			int emp_id= sc.nextInt();
			if(!(emp_id>=2001)&& (emp_id<=2005))
				throw new myException("The employee id must be between 2001 to 2005");
			
			System.out.println("Enter department id:");
			int dept_id= sc.nextInt();
			if(!(dept_id>=1)&& (dept_id<=5))
				throw new myException("the department id must be between 1 to 5");
			
			
			System.out.println("Name:"+name);
			System.out.println("Employee Id:"+emp_id);
			System.out.println("Department Id:"+dept_id);
			
	
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
