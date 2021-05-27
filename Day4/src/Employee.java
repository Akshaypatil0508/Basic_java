//que 3

import java.util.Scanner;

public class Employee 
{
	private int ID;
	private String name;
	private double Basic_salary,HRA,medical,PT,Pf,net_salary,gross_salary ;
	
	public void acceptdetails()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Employee ID==>");
		ID=sc.nextInt();
		System.out.println("Enter Employee name==>");
		name=sc.next();
		System.out.println("Enter Basic Salary==>");
		Basic_salary=sc.nextDouble();
		//sc.close();
		
	}
	public void calsalary()
	{
		HRA=0.5*Basic_salary;
		Pf=0.12*Basic_salary;
		PT=200;
		medical=500;
		gross_salary=Basic_salary+HRA+medical;
		net_salary=gross_salary-(PT+Pf);
	}
	public void displaydetails()
	{
		System.out.println("Employee id==>"+ID);
		System.out.println("Employee Name==>"+name);
		System.out.println("Gross salary of employee==>"+gross_salary);
		System.out.println("Net salary of employee==>"+net_salary);
		
	}

}
