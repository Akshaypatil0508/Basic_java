/*9:Sum of series :
	1+2+3+….+n*/

import java.util.Scanner;

public class Que9 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n;
		int sum=0;
		System.out.println("Enter the last number==>");
		n=sc.nextInt();
		
		for(int i=1;i<=n;i++)
		{
			sum=sum+i;
			
		}
		System.out.println("SUM==>"+sum);
		sc.close();

	}

}
/*output
Enter the last number==>
15
SUM==>120 */