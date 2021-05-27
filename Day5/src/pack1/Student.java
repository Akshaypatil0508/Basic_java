package pack1;

import java.util.Scanner;
public class Student {
	public int rollNo;
	public String name;
	protected char grade;
	int totalMarks;
	Scanner sc = new Scanner(System.in);
	public void acceptInfo()
	{
	
		System.out.println("Enter roll number: ");
		rollNo = sc.nextInt();
		System.out.println("Enter name: ");
		name = sc.next();
		System.out.println("Enter Grade: ");
		grade = sc.next().charAt(0);
		System.out.println("Enter total marks: ");
		totalMarks = sc.nextInt();
		
	}
	
	public void displayInfo()
	{
		System.out.println("———————————Student Info———————————");
		System.out.println("Roll No: "+rollNo);
		System.out.println("Name: "+name);
		System.out.println("Grade: "+grade);
		System.out.println("Total Marks: "+totalMarks);
	}
}
