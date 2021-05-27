/*2:Write a program to addition 
of two numbers also addition of two characters.*/


import java.util.Scanner;
public class Que2 {

	public static void main(String[] args) {
		int num1;
		int num2;
		int sum;
		char ch1;
		char ch2;
		String result;
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter first number=");
		num1=sc.nextInt();
		System.out.println("Enter secound number=");
		num2=sc.nextInt();
		sum=num1+num2;
		System.out.println("sum of two number is "+sum);
		
		System.out.println("Enter first character=");
		ch1=sc.next().charAt(0);
		System.out.println("Enter second character=");
		ch2=sc.next().charAt(0);
		result=Character.toString(ch1)+Character.toString(ch2)
;
		System.out.println("sum of two charcters is==>"+result);
	
	}

}

/*output
  Enter first number=
10
Enter secound number=
20
sum of two number is 30
Enter first character=
a
Enter second character=
b
sum of two charcters is==>ab*/
