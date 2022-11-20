import java.util.Scanner;
import java.lang.String;

public class SaddlePoint {

public static void main(String[] args) {
 Scanner s = new Scanner(System.in);

System.out.println("Enter the size of 2d matrix:");
    int n = s.nextInt();  
    int arr[][] = new int[n][n];

System.out.println("Enter the array:");
    for (int i = 0; i < n; i++)
      for (int j = 0; j < n; j++) 
     {
        arr[i][j] = s.nextInt();
     }
    int col_max = 0;

    for (int i = 0; i < n; i++) 
    {
      int row_min = arr[i][0];  //smallest of row
     
      int col = 0;
      for (int j = 1; j < n; j++) 
      {
        if (arr[i][j] < row_min) 
        {
          row_min = arr[i][j];
          col = j;
        }
      }
      for (int k = 0; k < n; k++) 
      {
        if (row_min < arr[k][col]) 
        {
          col_max = 0;
          break;
        } else
          col_max = row_min;
      }
      if (col_max != 0)
        System.out.println("saddle point " + col_max);
    }
    
  }

}