
//5:Write a program to accept array of 5 numbers and display it.
import java.util.Scanner;
public class Que5 {

	public static void main(String[] args)
	{
		
		Scanner sc=new Scanner(System.in);
		int i;
		int[] arr = new int[5];
		System.out.println("Enter array elemnts==>");
		for( i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		for( i=0;i<arr.length;i++)
		{		
		System.out.println("Array elemnts are "+arr[i]);
		}
		

	}

}
/*output
Enter array elemnts==>
5
10
15
20
25
Array elemnts are 5
Array elemnts are 10
Array elemnts are 15
Array elemnts are 20
Array elemnts are 25
*/