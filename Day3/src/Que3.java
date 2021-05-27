//3:Write a java program to make the addition of two 2D array And store result in Third array.

import java.util.Scanner;
public class Que3
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int[][] arr= {{1,2,3},{4,5,6} };
		int[][] arr1= {{10,11,12},{13,14,15}};
		int[][] sum=new int[2][3];
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<3;j++)
			{
				sum[i][j]=arr[i][j]+arr1[i][j];
			}
		}
		
		System.out.println("sum of array elements is==>");
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(sum[i][j]+" ");
			}
			System.out.println();
		}
		sc.close();
		
	}
}
/* output
 * sum of array elements is==>
11 13 15 
17 19 21 

 */
	

