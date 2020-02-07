//Finally Example.

class FinallyDemo
{
	public static void main(String args[])
	{
		try
		{
			int a=5;
			int b=0;
			int c=a/b;
		}
		
		catch(ArithmeticException e)
		{
			System.out.println("System Message : "+e.getMessage());
		}
		
		finally
		{
			System.out.println("Finally Block");
		}
	}
}