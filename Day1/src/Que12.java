//12.Write a  program to enter a number and print its reverse.
import java.util.Scanner;
public class Que12 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int num,rem,rev=0;
		System.out.println("Enter number==>");
		num=sc.nextInt();
		while(num!=0)
		{
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		System.out.println("revrse number is ="+rev);
		sc.close();
	}

}
/*output
 * Enter number==>
35
revrse number is =53 */
