import java.util.Scanner;
class ABC
{
    //Rearrange function  
    public static void Rearrange(int array[], int n)
    {
        int i = -1;
        //swap positive elements to the start of the array
        for (int j = 0; j < n; j++)
        {
            if (array[j] > 0)
            {
                i = i + 1;
                array[i] = (array[i] + array[j]) - (array[j] = array[i]);
            }
        }
        //Initialize positive_index, negative_index
        int positive_index = 0, negative_index = i + 1;
        //Increment postive by 2 and negative by 1.
        //swap elements after each increments and swap them.
        //such that alternative elements will be changed
        while (negative_index < n && negative_index > positive_index && array[negative_index] < 0)
        {
            array[negative_index] = (array[negative_index] + array[positive_index]) - (array[positive_index] = array[negative_index]);
            positive_index = positive_index + 2;
            negative_index = negative_index + 1;
        }
    }
    public static void main(String[] args)  
    { 
        Scanner sr = new Scanner(System.in);
        int n = sr.nextInt();
        int a[] = new int[n];
        System.out.println("Enter the array elements":);
        for(int i=0;i<n;i++)
        {
            a[i] = sr.nextInt();
        }
        Rearrange(a, n);
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}
