import java.util.*;
class Zigzag{
	public static void main(String args[])
	{
		System.out.println("Program made by Riya Sharma CE-32");
		int a[]=new int[100];
		int n;
		int temp,temp1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements: ");
		n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=1;i<n;i+=2)
		{
			if(a[i-1]>a[i])
			{
				temp=a[i-1];
				a[i-1]=a[i];
				a[i]=temp;
			}
			if(i+1<n && a[i+1]>a[i])
			{
				temp1=a[i+1];
				a[i+1]=a[i];
				a[i]=temp1;
			}	
		}
		for(int i=0;i<n;i++)
		{
			System.out.println(+a[i]);	
		}
}
}