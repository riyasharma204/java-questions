import java.util.Scanner;
class pc2{
 	public static void sort(int arr[] , int a){
	System.out.println("Riya Sharma CE 32 ");
    for (int i = 0; i < a-1; i++)
    {
        for (int j = 0; j < a-i-1; j++)
            if (arr[j] > arr[j+1])
        {     int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
}
}
    static void nosort(int arr[] , int a){	
    for (int i = 0; i < a-1; i++)
    {
        for (int j = 0; j < a-i-1; j++)
            if (arr[j] < arr[j+1])
        {
              int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
}}
public static void main(String[] args) {
  Scanner aa = new Scanner(System.in);
int n=aa.nextInt();
 int array[] = new int[n];
 for(int i=0;i<n;i++)
 {   array[i]=aa.nextInt();
 }
sort(array,n);
int k=0;
int count=0;
while(array[k]<0)
{  count++;
    k++;
}
nosort(array,count);
System.out.println("--------output---------");
for(int i=0;i<n;i++)
{   System.out.println(array[i]);
} 
}
}








