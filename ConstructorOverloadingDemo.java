//Constructor Overloading Example..

import java.util.*;

class ConstructorOverloadingDemo
{
	
	int a;
	double b;
	
	ConstructorOverloadingDemo()
	{
		System.out.println("This is a Default Constructor.");
	}
	
	ConstructorOverloadingDemo(int i)
	{
		a=i;
		System.out.println("Value Of I : "+a);
	}
	
	ConstructorOverloadingDemo(double j)
	{
		b=j;
		System.out.println("Value of J : "+b);
	}
	
	public static void main(String args[])
	{
		int I;
        double J;
		
		Scanner In=new Scanner(System.in); 
		
			System.out.print("Enter Integer Value of I : ");
			I=In.nextInt();
			
			System.out.print("Enter Double Value of J : ");
			J=In.nextDouble();
			
		ConstructorOverloadingDemo cod1=new ConstructorOverloadingDemo();
		ConstructorOverloadingDemo cod2=new ConstructorOverloadingDemo(I);
		ConstructorOverloadingDemo cod3=new ConstructorOverloadingDemo(J);
	}
}