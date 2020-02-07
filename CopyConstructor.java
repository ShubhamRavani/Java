//Copy Constructor.

import java.util.*;
class CopyConstructor
{
	int id;
	String name;
	
	CopyConstructor(int i,String n)
	{
		id=i;
		name=n;
	}
	
	CopyConstructor(CopyConstructor c)
	{
		id=c.id;
		name=c.name;
	}
	void display()
	{
		System.out.println("ID : "+id);
		System.out.println("Name  : "+name);
	}
	
	public static void main(String args[])
	{
		int a;
		String b;
		
		Scanner In=new Scanner(System.in); 
		
		System.out.print("Enter Integer Value : ");
		a=In.nextInt();
		
		System.out.print("Enter String : ");
		b=In.next();
		
		CopyConstructor cc1=new CopyConstructor(a,b);
		CopyConstructor cc2=new CopyConstructor(cc1);
		
		cc1.display();
		cc2.display();
	}
}
	