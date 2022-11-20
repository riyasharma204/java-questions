import java.util.*;
import java.lang.*;
import java.lang.String;

class Arraydemo{
 static int arrayfunc(int a[],int x)
 {
 int count=0;
 for(int i=0;i<a.length-1;i++){
 for(int j=i+1;j<a.length;j++){
 if(a[i]+a[j]==x)
 {count++;}
 }
 }
 return count;
 }
 static void arrayfunc(int a[],int p,int b[], int q)
 {
 int i=0, j=0, k=0;
 int c[] = new int[p+q];
 while (i<p && j <q)
 { if (a[i] < b[j])
 c[k++] = a[i++];
 else
 c[k++] = b[j++];
 }

 while (i < p)
 c[k++]=a[i++];

 while (j < q)
 c[k++]=b[j++];
 int x=0; k=0;
 for(x=0;x<p;x++)
 {
 a[x]=c[k++];
 }

 for(x=0;x<q;x++)
 {
 b[x]=c[k++];
 }
 System.out.println("Array one: ");
 for(int e=0;e<p;e++)
 {
 System.out.println(a[e]);
 }
 System.out.println("Array two: ");
 for(int f=0;f<q;f++)
 {
 System.out.println(b[f]);
 }
 }


 public static void main(String args[]){
 Scanner sc=new Scanner(System.in);
 System.out.println("Aryamann Singh , CE - 18");
 System.out.println("Press 1 for finding sum ");
 System.out.println("Press 2 for merging two arrays ");
 int ch=sc.nextInt();
 switch(ch){
 case 1:
 {
 int i;
 System.out.println("Enter the length of the array");
 int n=sc.nextInt();
 int a[]=new int[n];
 System.out.println("Enter the elements of the array");
 for(i=0;i<n;i++)
 {
 a[i]=sc.nextInt();
 }
 System.out.println("Enter the target element");
 int x=sc.nextInt();
 int c=arrayfunc(a,x);
 System.out.println("Number of pairs are: "+c);
 break;
 }

 case 2:
 {
 int i,j;
 System.out.println("Enter the length of first array");
 int p=sc.nextInt();
 System.out.println("Enter the length of second array");
 int q=sc.nextInt();
 int a[]=new int[p];
 int b[]=new int[q];
 System.out.println("Enter the elements of first array");
 for(i=0;i<p;i++)
 {
 a[i]=sc.nextInt();
 }
 System.out.println("Enter the elements of second array");
 for(j=0;j<q;j++)
 {
 b[j]=sc.nextInt();
 }
 arrayfunc(a,p,b,q);
 }

 }
}
} 