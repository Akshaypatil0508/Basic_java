//8.Check if number is a prime number or not.


import java.util.Scanner;
public class Que8 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int num,temp=0;
		System.out.println("Enter a number==>");
		num=sc.nextInt();
		
		for(int i=2;i<=num-1;i++)
		{
			
			if(num%i==0)
			{
				temp=temp+1;
				
			}	
		}
		if(temp==0)
		{
			System.out.println("number is a prime number");
		}
		else
		{
			System.out.println("Number is not a prime number");
		}
		
	}
}
/*output
Enter a number==>
17
number is a prime number*/