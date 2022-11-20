import java.util.Scanner;
import java.lang.Exception;
import java.lang.String;
import java.lang.Math;
public class MYcalculator {
    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in); 
      try
      {
         System.out.println("Enter no and the exponent");
         int n=sc.nextInt();
         int p=sc.nextInt();
          if(n<0 || p<0)
          {
          throw new Exception("Number or power should be positive.");
        }
          if(n==0 || p==0)
          {
          throw new Exception("Number or power cannot be zero.");
        }
          System.out.println("Final answer is : "+Math.pow(n,p));
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
