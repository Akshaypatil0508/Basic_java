//3.Write function to swap two numbers.
import java.util.Scanner;
public class Que3 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int a,b;
		System.out.println("Enter first number==> ");
		a=sc.nextInt();
		System.out.println("Enter second number");
		b=sc.nextInt();
		swap(a,b);
		
		

	}
	
	public static void swap(int n1,int n2)
	{
		int temp;
		temp=n1;
		n1=n2;
		n2=temp;
		System.out.println("After swapping");
		System.out.println(" n1=> "+ n1 +"  n2=> "+n2);
		
	}

}
/*output
  Enter first number==> 
10
Enter second number
20
After swapping
 n1=> 20  n2=> 10
*/
