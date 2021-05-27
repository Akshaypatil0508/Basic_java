/*8: Create a java application for the following.
 Create a Customer class , with data members (all private : tight encapsulation)
name(String),email(String),age(int).Supply a parameterized constructor to 
accept all details from user.Supply an argument less  
constructor to init default name to "Riya" ,
 email to "riya@gmail.com",age=25.Write a method displayCustomer to display customer details.*/

import java.util.Scanner;
public class Que8 {
 private static String name;
 private static String email;
 private static int age;
 public static void acceptInfo()
 {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("enter the name of customer:");
	 name=sc.nextLine();
	 System.out.println("enter the email of customer:");
	 email=sc.next();
	 System.out.println("enter the age of customer");
    age=sc.nextInt();
 }
 public static void Display()
 {
	 System.out.println("name ="+ name + " email=" +email + " age="+ age);
 }
}
