//5:Write a program to  merge two arrays into a single array.


import java.util.Scanner;

public class Que5 
{

	public static void main(String[] args) 
	{
		int a[],b[],size1,size2;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter size of first array -");
		size1 = sc.nextInt();
		System.out.println("Enter first Array elements: ");
		a= new int[size1];
		for(int i=0; i<size1; i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enter size of second array -");
		size2 = sc.nextInt();
		System.out.println("Enter second Array elements: ");
		b= new int[size2];
		for(int i=0; i<size2; i++)
		{
			b[i]=sc.nextInt();
		}
		
		mergeArr(a,b);
		sc.close();
	

	}
	public static void mergeArr(int x[], int y[])
	{
		int c[]= new int[x.length+y.length];
		
		for(int i=0; i<x.length; i++)
		{
			c[i]=x[i];
		}
		
		for(int i=0; i<y.length; i++)
		{
			c[i+x.length]=y[i];
		}
		
		System.out.println("Merged Array: ");
		for(int i=0; i<c.length; i++)
		{
			System.out.print(c[i]+"\t");
		}

	}
	
}
/*output
Enter size of first array -
5
Enter first Array elements: 
1
2
5
6
7
Enter size of second array -
5
Enter second Array elements: 
9
8
98
08
64
Merged Array: 
1	2	5	6	7	9	8	98	8	64  */