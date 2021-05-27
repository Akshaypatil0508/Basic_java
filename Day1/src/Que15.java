//15:Write a program to find greatest of three numbers using nested if-else.
import java.util.Scanner;

public class Que15 {

	public static void main(String[] args)   
	{  
	int a, b, c, largest, temp;  
	 
	Scanner sc = new Scanner(System.in);  
	  
	System.out.println("Enter the first number:");  
	a = sc.nextInt();  
	System.out.println("Enter the second number:");  
	b = sc.nextInt();  
	System.out.println("Enter the third number:");  
	c = sc.nextInt();  
  
	temp=a>b?a:b;  
	  
	largest=c>temp?c:temp;  
  
	System.out.println("The largest number is: "+largest);  
	}  
}
/*output
Enter the first number:
10
Enter the second number:
20
Enter the third number:
30
The largest number is: 30  */