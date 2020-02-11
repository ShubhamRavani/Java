//Java Program to Reverse a String using Recursion.


public class StringRecursion
{
	public static void main(String args[])
	{
		String str="Shubham";
		String rev = rString(str);
        System.out.println("Reversed string is: " +rev);
	}
	public static String rString(String str)
    {
        if (str.isEmpty())
		{
			return str;
		}
		return rString(str.substring(1)) + str.charAt(0);
	}
}