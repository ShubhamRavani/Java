//Static Keyword..


import java.util.*;

public class StaticKey
{
	static int count=0;
	public static void showData()
	{
		System.out.println(count);
		System.out.println("Inside Static Method");
	}
	
	public void getData()
	{
		System.out.println(count+1);
		System.out.println("Inside Non-Static Method");
	}
	
	static
	{
		System.out.println("Static Block runs before Main Method.");
	}
	
	public static void main(String args[])
	{
		StaticKey sk=new StaticKey();
		showData();
		sk.getData();
	}
}