//1:Write a function to accept array of string.Display all elements in uppercase.
import java.util.Scanner;
public class Que1
{

	public static void main(String[] args)
	{
		stringArr();
		
	}
	public static void stringArr()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String Array Size: ");
		int n = sc.nextInt();
		String arr[]= new String[n];
		System.out.println("Enter Array Elements: ");
		for(int i=0; i<n; i++)
		{
			arr[i] =sc.next();
		}
		System.out.print("\nArray Elements Converted into UpperCase: ");
		for(int j=0; j<n;j++)
		{
			System.out.print(" "+arr[j].toUpperCase());
		}
		sc.close();
	}


}
/*output
 * Enter String Array Size: 
2
Enter Array Elements: 
akshay patil

Array Elements Converted into UpperCase:  AKSHAY PATIL   */
