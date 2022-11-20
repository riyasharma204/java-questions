import java.util.*;
class Rearrange1{
	public static void main(String args[])
	{
		System.out.println("Program made by Riya Sharma CE-32");
		int arr[]=new int[100];
		int n;
		int temp;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements: ");
		n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int j = 0;
        	for (int i = 0; i < n; i++) {
            		if (arr[i] < 0) {
                	if (i != j) {
                    		temp = arr[i];
                    		arr[i] = arr[j];
                    		arr[j] = temp;
                		}
                		j++;
            		}
        	}
		System.out.println("The output array is: ");
		for(int i=0;i<n;i++)
			System.out.println(arr[i] + " ");
	}
}