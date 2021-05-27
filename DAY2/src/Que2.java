/*
2:Write a program which will accept student information like rollno,name,5 subject marks.calculate total and percentage.calculate grade.. 
           per >75 grade :A
           per<74 and >60 :B
           per<59  :C*/
import java.util.Scanner;
public class Que2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int rollno;
		String name;
		System.out.println("student name==>");
		name=sc.nextLine();
		System.out.println("Enter roll number==>");
		rollno=sc.nextInt();
		System.out.println("Enter five subjects mark==>");
		int[] marks=new int[5];
		for(int i=0;i<marks.length;i++)
		{
			marks[i]=sc.nextInt();
			
		}
		int obtained=0;
		
		for( int j=0;j<marks.length;j++)
		{
			obtained=obtained+marks[j];
			
		}
		
		System.out.println("Obtained==>"+obtained);
		
		double percent;
		double total;
		System.out.println("Enter total marks==>");
		total=sc.nextInt();
		
		
		percent=((obtained/total)*100);
		
		System.out.println("percent==>"+percent);
		if(percent>75)
			System.out.println("A Grade");
		
		else if(percent<74 || percent>60)
			System.out.println("B Grade ");
		
		else if(percent<59)
			System.out.println("c Grade");
		

	}

}
/*output
student name==>
akshay
Enter roll number==>
1140
Enter five subjects mark==>
70
75
80
85
90
Obtained==>400
Enter total marks==>
500
percent==>80.0
A Grade*/