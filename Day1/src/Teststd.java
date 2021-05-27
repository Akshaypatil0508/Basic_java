import java.util.Scanner;

public class Teststd 
{

	public static void main(String[] args) 
	{
		
		Scanner sc=new Scanner(System.in);
		
		
	//	Std s1 = new Std(r,nm,tot);
		//s1.display();
		Std[] allstud =new Std[5];
		
		for(int i=0;i<allstud.length;i++)
		{
			System.out.println("roll no name total");
			int r=sc.nextInt();
			String nm=sc.next();
			int tot =sc.nextInt();
			Std s = new Std(r,nm,tot);
			allstud[i]=s;
			
		}
		for(int i=0;i<allstud.length;i++)
		{
			allstud[i].display();
		}
	}

}
