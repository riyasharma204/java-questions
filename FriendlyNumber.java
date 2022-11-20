import java.util.*;
class FriendlyNumber{
	public static void main(String args[])
	{
		int a,b;
		float div1,div2;
		Scanner sc=new Scanner(System.in);
		System.out.println("Program Made By Riya Sharma CE-32 ");
		System.out.println("Enter the first number: ");
		a=sc.nextInt();
		System.out.println("Enter the second number: ");
		b=sc.nextInt();
		int sum1=0,sum2=0,i=1,j=1;
		while(i<=a)
		{
			if(a%i==0)
			{
				sum1=sum1+i;
				i++;
			}
			else
				i++;
		}
		div1=sum1/a;
		while(j<=b)
		{
			if(b%j==0)
			{
				sum2=sum2+j;
				j++;
			}
			else
				j++;
		}
		div2=sum2/b;
		if(div1==div2)
			System.out.println("Friendly Numbers");
		else
			System.out.println("Not Friendly Numbers");
	}
}