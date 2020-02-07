//Find maximum of three numbers using conditional operator.


import java.util.*;

class GreaterDemo
{
	public static void main(String args[])
	{
		int a,b,c;
		
		Scanner In=new Scanner(System.in);
		
		System.out.print("Enter A : ");
		a=In.nextInt();
		
		System.out.print("Enter B : ");
		b=In.nextInt();
		
		System.out.print("Enter C : ");
		c=In.nextInt();
		
		if(a==b && b==c)
		{
			System.out.println("Every variable has equal value.");
		}
		
		else if(a>b && a>c)
		{
			System.out.println("A is Greater.");
		}
		
		else if(b>a && b>c)
		{
			System.out.println("B is Greater.");
		}
		
		else
		{
			System.out.println("C is Greater.");
		}
		
	}
	
}