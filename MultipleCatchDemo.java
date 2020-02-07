//Multiple Catch Example..

import java.util.*;
class MultipleCatchDemo
{
	public static void main(String args[])
	{
		
		int A;
		
		Scanner In=new Scanner(System.in);
		
		System.out.println("Enter Value : ");
		A=In.nextInt();
		
		try
		{
			int a[]={1,2,3};
			a[4]=6/A;
		}
		
		catch(ArithmeticException ae)
		{
			System.out.println(ae);
		}
		
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
	}
}