//Arithmatic Operations Example.. 

import java.util.Scanner;
class ArithmaticOperations
{
	public static void main(String args[])
	{
		int a,b,ans;
		
		Scanner In=new Scanner(System.in);
		System.out.print("Enter A : ");
		a=In.nextInt();
		
		System.out.print("Enter B : ");
		b=In.nextInt();
		
		ans=a+b;
		System.out.println("Addition : " +ans);
		
		ans=a-b;
		System.out.println("Subtraction : " +ans);
		
		ans=a*b;
		System.out.println("Multiplication : " +ans);
		
		ans=a/b;
		System.out.println("Division : " +ans);
		
	}	
}