/*10: Write a  program to input basic salary of an employee and calculate its Gross salary according to 
following: Basic Salary <= 10000 : HRA = 20%, DA = 80% Basic Salary <= 20000 : HRA = 25%, DA = 90% 
Basic Salary > 20000 : HRA = 30%, DA = 95%*/
import java.util.Scanner;

public class Que10 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int sal,HRA,DA,Gross;
		System.out.println("Basic salary==>");
		sal= sc.nextInt();
		System.out.println("HRA==>");
		HRA=sc.nextInt();
		System.out.println("DA==>");
		DA=sc.nextInt();
		HRA=(HRA*sal)/100;
		DA=(DA*sal)/100;
		Gross=sal+HRA+DA;
		System.out.println("Gross salary is==>"+Gross);
		sc.close();
		
		
		

	}

}
/*output
 * Basic salary==>
20000
HRA==>
5
DA==>
5
Gross salary is==>22000*/
