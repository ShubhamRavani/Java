//String HashCode Demo..

class StringHashDemo
{	
	public static void main(String[] args)
	{
		String s1 = "Java";
		String s2 = "Java";
		String s3 = new String("Java");

		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		System.out.println("".hashCode());
	}
}