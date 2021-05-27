//8:Write a Java program to find the maximum and minimum value of an array.
import java.util.Scanner;

public class Que8 {

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		
		int[] arr = new int[] {10,20,30,40,50};
		int max = arr[0];
		int min = arr[0];
		
		for (int i=1;i <arr.length;i++)
		{
			if(max<arr[i])
			{
				max=arr[i];
			}
			else if(min>arr[i])
			{
				min=arr[i];
			}
		}
		System.out.println("Maximum number==>"+max+ "  minimum number==>"+min);
		

	}

}
/*output
 * Maximum number==>50  minimum number==>10*/
