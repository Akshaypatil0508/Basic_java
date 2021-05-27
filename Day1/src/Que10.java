//10:Check whether the number is palindrome or not?

import java.util.Scanner;
public class Que10 {

	public static void main(String[] args) {
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number: ");
		num = sc.nextInt();
		System.out.println("\n");
		
		Que10 pn = new Que10();
		pn.checkPalindrome(num);
}
	void checkPalindrome(int n)
	{
		int originalNum,check = 0;
		originalNum = n;
		while(n!=0) 
		{
			check += (n % 10);
			check = check * 10;
			n=n/10;
		}
		check = check/10;
		
		if(originalNum == check)
			System.out.println(originalNum+" is a Palindrome number.");
		else
			System.out.println(originalNum+" is not a palindrome number.");
		
	}
}

/*output
Enter a Number: 
121


121 is a Palindrome number.
*/