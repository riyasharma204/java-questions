import java.util.*;
class Demo{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String name,course;
		int uroll,sem;
		System.out.println("Program Made By:- Riya Sharma CE-32");
		System.out.println("Enter the name of the student: ");
		name=sc.nextLine();
		System.out.println("Enter the course: ");
		course=sc.nextLine();
		System.out.println("Enter the university roll number: ");
		uroll=sc.nextInt();
		System.out.println("Enter the semester: ");
		sem=sc.nextInt();
		System.out.println("Name: "+name);
		System.out.println("University Roll No: "+uroll);
		System.out.println("Course: "+course);
		System.out.println("Semester: "+sem);
	}
}		