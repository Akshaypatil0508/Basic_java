/*7:Write a Java program , accept array ,accept number from user 
and  find the index of number in array if present else show message not exist.*/

import java.util.Scanner;

public class Que7 
{

	public static void main(String[] args) 
	{
		int i,n, arr[];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size: ");
		n = sc.nextInt();
		arr = new int[n];
		System.out.println("Enter "+n+" Array elements:");
		for(i=0; i<n; i++) 
		{
			arr[i]= sc.nextInt();
		}
		System.out.println("\nEnter the number which is in the array: ");
		int find = sc.nextInt();
		
		Que7 obj = new Que7();
		
		int number = obj.findInd(arr, find);
		if(number==-1)
			System.out.println(find+" is not there in the array.");
		else
		System.out.println(find+" is at the index "+number);
		sc.close();
		

	}
	int findInd(int a[],int x)
	{
		int i=0;
		int len = a.length;
		while(i<len)
		{
			if(a[i]==x)
				return i;
			else
				i++;
		}
		return -1;
	}

}
/*output
 Enter array size: 
3
Enter 3 Array elements:
10
15
20

Enter the number which is in the array: 
15
15 is at the index 1  */
