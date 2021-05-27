import java.util.Scanner;

public class Practice 
{

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter size==>");
		int size=sc.nextInt();
		String[]  name = new String[size];
		System.out.println("Enter the name==>");
		
		for (int i=0;i<name.length;i++)
		{
			name[i]=sc.next();
		}
		
		for (int i=0;i<name.length;i++)
		{
			System.out.println(name[i]);
		}
		System.out.println("--------------------------------------");
		System.out.println("By using for each loop");
		
		for(String s:name)
		{
			System.out.println(s);
		}

	}

}
