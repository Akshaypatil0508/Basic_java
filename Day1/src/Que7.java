//7:Write a program to find m to the power n


import java.util.Scanner;
public class Que7 {

	public static void main(String[] args) {
		
		int num, power;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the base number: ");
		num = sc.nextInt();
		System.out.println("Enter the power of number: ");
		power = sc.nextInt();
		
		Que7 np = new Que7();
		np.NumPow(num, power);
		
	}
	void NumPow(int n, int power)
	{
		int originalPower;
		long res =1;
		originalPower = power;
		while(power!=0)
		{
			res = res * n;
			--power;
		}
		
		System.out.println("Power "+originalPower+" to "+n+" is "+res);
	}


}
/* output
  Enter the base number: 
10
Enter the power of number: 
2
Power 2 to 10 is 100*/
