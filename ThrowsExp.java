import java.lang.String;
class ThrowsExp
{
	static void fun() throws IllegalAccessException   //declare an exception.
	{
		System.out.println("Inside fun(). ");
                            throw new IllegalAccessException("demo");
	}
	public static void main(String args[])
	{
		try
		{
			fun();
		}
		catch(IllegalAccessException e)
		{
			System.out.println("caught in main.");
		}
	}
}
