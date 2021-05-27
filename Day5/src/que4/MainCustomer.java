package que4;

import java.util.Scanner;
public class MainCustomer {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Customer c1 = new Customer();
		Customer c2 = new Customer("Harshal","harshal@gmail.com", 20, 50000);
		
		System.out.println("Change Credit Limit:");
		double creditLimit = sc.nextDouble();
		c2.setCreditLimit(creditLimit);
		System.out.println("Credit Limit Changed: "+c2.getCreditLimit());
	}

}
/* output
ArgumentLess Customer:	Akshay  akshay0508@gmail.com	25	20000.0
Parameterized Customer:	Harshal  harshal@gmail.com	20	50000.0
Change Credit Limit:
500000
Credit Limit Changed: 500000.0     */