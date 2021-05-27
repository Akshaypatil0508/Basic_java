//6:Write a program to find factorial of a given number.


import java.util.Scanner;
public class Que6 {

	public static void main(String[] args) {
		int i,fact=1,num;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number==>");
		num=sc.nextInt();
		for(i=1;i<=num;i++)
		{
			fact=fact*i;
		}
		System.out.println("Factorial of given number is="+fact);
		
	}

}
/*output
Enter a number==>
5
Factorial of given number is=120 */