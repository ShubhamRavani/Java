//Parameterized Constructor.

import java.util.*;

class ParaConstructor
{
	ParaConstructor()
	{
		System.out.println("This is Constructor.");
	}
	
	ParaConstructor(int x,int y)
	{
		System.out.println("X + Y : " +(x+y));
	}
}

class ParameterizedConstructor
{
	public static void main(String args[])
	{
		
		int m,n;
		
		Scanner In=new Scanner(System.in);
		
		System.out.print("Enter A : ");
		m=In.nextInt();
		
		System.out.print("Enter B : ");
		n=In.nextInt();
		
		System.out.println();
		
		ParaConstructor a=new ParaConstructor();
		
		System.out.println();
		
		ParaConstructor a1=new ParaConstructor(m,n);
		
	}
}