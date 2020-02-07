//StringBuffer and StringBuilder..

class StringBBDemo
{
	public static void main(String[] args)
	{  

		StringBuffer buffer=new StringBuffer("hello");  
        buffer.append("java");  
        System.out.println(buffer); 
		
        StringBuilder builder=new StringBuilder("hello");  
        builder.append("java");  
        System.out.println(builder);  
    }  
}