//This Keyword.


import java.util.*;

class A
{
	int a,b,ans;
	
	void get(int a,int b)
	{
		this.a=a;
		this.b=b;
	}
	
	void sum()
	{
		ans=this.a + this.b;
	}
	
	void display()
	{
		System.out.println("Addition : "+ans);
	}
}

class ThisDemo
{
	public static void main(String args[])
	{
		A a1=new A();
		
		int a,b;
		Scanner In=new Scanner(System.in);
		
		System.out.print("Enter A : ");
		a=In.nextInt();
		
		System.out.print("Enter B : ");
		b=In.nextInt();
		
		a1.get(a,b);
		a1.sum();
		a1.display();
	}
}