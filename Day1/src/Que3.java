/*3:Find the compound amount and compound interest on 
the principal Rs.20,000 borrowed at 6% compounded annually for 3 years.*/

import java.lang.Math;
import java.text.DecimalFormat;
import java.util.Scanner;
public class Que3 {

	public static void main(String[] args) {
		double ci;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Principal amount: ");
		double principal = sc.nextDouble();
		System.out.println("Enter rate of interest: ");
		float rate = sc.nextFloat();
		System.out.println("Enter number of years: ");
		float time = sc.nextFloat();
		
		ci = principal * Math.pow((1+ rate/100),time);
		
		System.out.println(new DecimalFormat("Compund Interest: 0.00").format(ci));
		
	}
	
}
/*output
Enter Principal amount: 
20000
Enter rate of interest: 
4
Enter number of years: 
2
Compund Interest: 21632.00 */