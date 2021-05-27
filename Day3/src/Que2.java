//2:Write a Java program to accept 2D aaray elements.Display all elements.

import java.util.Scanner;

public class Que2 
{

	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		int[][] arr =new int[3][3];
		int i,j;
		
		System.out.println("Enter array elements==>");
		
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("--------------------------");
		
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		sc.close();
		
	}

}
/*output
Enter array elements==>
10
20
30
40
50
60
70
80
90
--------------------------
10 20 30 
40 50 60 
70 80 90 
*/