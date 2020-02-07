//Throws example..

import java.io.*;
class ThrowsDemo
{
	static void display() throws ArithmeticException
	{
		System.out.println("Inside display function");
		throw new ArithmeticException("Example..");
	}
	public static void main(String args[])
	{
		try
		{
			display();
		}
		catch(ArithmeticException ae)
		{
			System.out.println("Caught::"+ae);
		}
	}
}