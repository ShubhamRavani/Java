//Write a java program to sum value of Array..


public class SumofArray
{
	public static void main(String args[])
	{
		int arr[]={10, 20, 30, 40, 50, 60};
		int sum=0;
      
		for(int num:arr)
		{
			sum=sum+num;
		}
      System.out.println("Additiion of Array is: "+sum);
   }
}