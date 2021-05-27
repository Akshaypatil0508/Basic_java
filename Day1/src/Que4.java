
//4:Write a program to calculate power of a number.
import java.util.Scanner;
public class Que4 {

	public static void main(String[] args) {
		
		int base;
		int exponent;
		long result=1;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter base==>");
		base=sc.nextInt();
		System.out.println("Enter exponent==>");
		exponent=sc.nextInt();
		
		while(exponent!=0)
		{
			result*=base;
			--exponent;
			
		}
		System.out.println("Answer="+result);
		
	}

}
/* output
Enter base==>
5
Enter exponent==>
2
Answer=25 */