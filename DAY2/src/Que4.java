//4:Write functions for making addition of diffrent types(use FunctionOverloading);
import java.util.Scanner;
public class Que4 {

	public static void main(String[] args) {
		int x,y,z;
		double p;
		Scanner sc= new Scanner(System.in);
		
	//	x=sc.nextInt();
		
	//	y=sc.nextInt();
		
	//	z=sc.nextInt();
		
	//	p=sc.nextDouble();
		
		
		//function calling
				addition();
				addition(10,20);
				addition(10,20,30.5);
				
				sc.close();
	}
	
	public static void addition()
	{
		int a, b,sum;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number1==>");
		a=sc.nextInt();
		System.out.println("Enter a number2==>");
		b=sc.nextInt();
		
		sum=a+b;
		System.out.println("SUM==>"+sum);
		sc.close();
		
		
		
		
		
	}
	public static void addition(int m,int n)
	{
		int sum;
		sum=m+n;
		System.out.println("SUM="+sum);
		
	}
	
	public static void addition(int m,int n,double o )
	{
		double sum;
		sum=m+n+o;
		System.out.println("SUM="+sum);
		
	}
	

}
/*output
  Enter a number1==>
15
Enter a number2==>
25
SUM==>40
SUM=30
SUM=60.5*/
