//Try..Catch.

class TryCatchDemo
{
	public static void main(String args[])
	{
		int a=5;
		int b=0;
		
		try
		{
			System.out.println("Sum = "+(a+b));
			System.out.println("Sub = "+(a-b));
			System.out.println("Mul = "+(a*b));
			System.out.println("Div = "+(a/b));
		}
		
		catch(ArithmeticException e)
		{
			System.out.println("System Message = "+e.getMessage());
			System.out.println("User Message = "+e);
		}
	}
}
			