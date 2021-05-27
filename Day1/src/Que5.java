
//5:Write a program to swap two numbers.


import java.util.Scanner;
public class Que5 {

	public static void main(String[] args) {
		int num1,num2,temp = 0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number= ");
		num1=sc.nextInt();
		System.out.println("Enter second number");
		num2=sc.nextInt();
		temp=num1;
		num1=num2;
		num2=temp;
		System.out.println("After swapping num1="+num1);
		System.out.println("After swapping num2="+num2);
	}

}
/*output
Enter first number= 
10
Enter second number
20
After swapping num1=20
After swapping num2=10 
*/