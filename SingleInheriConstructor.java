//Single Level Inheritance using Constructor..

import java.util.*;

class Parent
{
	Parent()
	{
		System.out.println("Inside Parent Class");
	}

}

class SingleInheriConstructor extends Parent
{
	SingleInheriConstructor()
	{
		System.out.println("Inside Child Class");
	}
	
	public static void main(String args[])
	{
		SingleInheriConstructor c1=new SingleInheriConstructor();
		
	}
}
