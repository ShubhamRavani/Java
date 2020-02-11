//Java program to find Factorial of a number using Recursion..


import java.util.*;

public class FactorialRecursion 
{
    public static void main(String args[]) 
	{
		Scanner In=new Scanner(System.in);
		System.out.print("Enter a Value: ");
        int num=In.nextInt();
        int fact=mn(num);
        System.out.println("Factorial is: " + fact);
    }
    public static int mn(int num)
    {
        if (num>=1)
		{
            return num*mn(num-1);
		}
        else
		{
            return 1;
		}
	}
}