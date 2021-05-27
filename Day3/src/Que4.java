/*4.Write a function /method which takes variable no of int numbers
as an argument and returns the sum of these arguments as an output.*/


public class Que4 
{

	public static void main(String[] args) 
	{
		
		sum(10,20,30);

	}
	public static void sum(int...a )//using variable arguments
	{
		int sum=0,i;
		for(i=0;i<a.length;i++)
		{
		sum=sum+a[i];
		}
		System.out.println("Sum of numbers is==> "+sum);
		
	}

}
/*output
 * Sum of numbers is==> 60   */
