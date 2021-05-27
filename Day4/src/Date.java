/*1:Create Date class with  data members day,month,year.
Write a method to accept all data members.
write display function to display date.*/

import java.util.Scanner;

public class Date 
{
	private int day,year;
	private String month; 
	
	public void acceptdate() 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter day==>");
		day=sc.nextInt();
		System.out.println("Enter month==>");
		month=sc.next();
		System.out.println("Enter year==>");
		year=sc.nextInt();
		sc.close();
		
	}
	public void displaydate()
	{
		System.out.println("DAY==>"+day);
		System.out.println("MONTH==>"+month);
		System.out.println("YEAR==>"+year);
	}
	

}
