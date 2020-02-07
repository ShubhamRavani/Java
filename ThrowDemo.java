//Throw Example..

class ThrowDemo
{
	static void demo()
	{
		try
		{
			throw new ArithmeticException("demo");
		}
		catch(ArithmeticException ae)
		{
			System.out.println("Exception Caught");
		}
	}
	public static void main(String args[])
	{
		demo();
	}
}