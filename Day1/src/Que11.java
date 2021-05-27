//11:Write a  program to find sum of all even and odd numbers between 1 to n


import java.util.Scanner;
public class Que11 {

	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		n = sc.nextInt();
		
		Que11 obj=new Que11();
		obj.evenSum(n);
		obj.oddSum(n);

	}
	void evenSum(int num) 
	{
		int i;
		long sum=0;
		for(i=1; i<=num; i++)
		{
			if(i%2==0)
			{
				sum += i;
			}
		}
		System.out.println("\nSum of all Even numbers between 1 to "+num +" is "+sum);
	}
	
	void oddSum(int num)
	{
		int i;
		long sum=0;
		for(i=1; i<=num; i++)
		{
			if(i%2!=0)
			{
				sum += i;
			}
		}
		System.out.println("\nSum of all Odd numbers between 1 to "+num+" is "+sum);
	}

}

/* output
 * Enter the number: 
10

Sum of all Even numbers between 1 to 10 is 30

Sum of all Odd numbers between 1 to 10 is 25 */
