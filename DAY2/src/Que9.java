/*9: Write a program to create an array of integers and perform following operations on that array like 
finding the sum, average, maximum and minimum number in that array. Accept the numbers of the 
array from user.*/
import java.util.Scanner;
import java.util.Arrays;
public class Que9 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		int size;
		int [] arr;
		int no,i;
		
		boolean flag= true;
		System.out.println("Enter size==>");
		size=sc.nextInt();
		arr= new int[size];
		System.out.println("Enter array elements==>");
		for(i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		//sc.close();
		System.out.println("*****Array operations*****");
		System.out.println("1:sum of array elements");
		System.out.println("2:average of array elements");
		System.out.println("3:maximum and minimum number in array");
		System.out.println("4: Exit");
		
		while(flag=true)
		{
			System.out.println("Enter a choice==>");
		     int choice=sc.nextInt();
			
			switch(choice)
			{
			case 1:
				int sum=0;
				for( i=0;i<arr.length;i++)
				{
					sum= sum+arr[i];
				}
				System.out.println("Sum of array elemnts is ::"+sum);
				break;
			
			
			case 2: 
				int sum1=0;
				double avg=0;
				for(i=0;i<arr.length;i++)
				{
					sum1= sum1+arr[i];
				}
				avg=sum1/arr.length;
				System.out.println("avg of array elements is ==>"+avg);
			    break;
			
			
			case 3:
				int max= arr[0];
				int min= arr[0];
				for (i=0;i<arr.length;i++)
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
				System.out.println("Max no is::" +max+ "   Min no is "+min);
				
				break;
				
			case 4:
				flag=false;
				break;
			
			}
		}
	
	sc.close();	}
	
}
/* output
 * Enter size==>
3
Enter array elements==>
10
15
20
*****Array operations*****
1:sum of array elements
2:average of array elements
3:maximum and minimum number in array
4: Exit
Enter a choice==>
1
Sum of array elemnts is ::45
Enter a choice==>
2
avg of array elements is ==>15.0*/
