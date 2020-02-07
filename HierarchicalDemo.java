class A
{
	public void displayA()
	{
		System.out.println("Class A is called.");
	}
}

class B extends A
{
	public void displayB()
	{
		System.out.println("Class B is called.");
	}
}

class C extends B
{
	public void displayC()
	{
		System.out.println("Class C is called.");
	}
}

class D extends A
{
	public void displayD()
	{
		System.out.println("Class D is called.");
	}
}

class HierarchicalDemo
{
	public static void main(String args[])
	{
		B b1=new B();
		C c1=new C();
		D d1=new D();
		
		b1.displayB();
		c1.displayC();
		d1.displayD();
		d1.displayA();
	}
}