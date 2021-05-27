
//6:Write a java program to sort array.


import java.util.Scanner;

public class Que6 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		int[] arr=new int[5];
		System.out.println("Enter array elemnts==>");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Before sorting");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("***After sorting***");
		
        int temp;
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
				
			}
		}
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		sc.close();
		
	}

}
/* output
Enter array elemnts==>
50
40
80
10
60
Before sorting
50 40 80 10 60 
***After sorting***
10 40 50 60 80     */