// Que 2

import java.util.Scanner;
public class Customer 
{
	private String name,Email;
	private int age;
	private double credit_limit;
	
	public void acceptinfo()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name==>");
		name=sc.next();
		System.out.println("Enter Email==>");
		Email=sc.next();
		System.out.println("Enter age==>");
		age=sc.nextInt();
	}
	
	public void setCreditLimit(double credit_limit)
	{
		this.credit_limit=credit_limit;
		
	}
	public double getcreditLimit()
	{
		return credit_limit;
	}
	
	public void ShowDetails()
	{
		System.out.println("you are:"+name+" "+Email+" "+age+" \\n creditlimit"+getcreditLimit());
	}
	
	
	

}
