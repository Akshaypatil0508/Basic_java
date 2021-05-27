/*11:Write a menu driven program for stationary shop.Items are 1:Pen 2:Pencil 3:NoteBook 4:Bottle 5:ColorBox.
1 pen cost is 10Rs,Pencil is 5 rs.NoteBook is 20 rs Bottle is 30 rs and ColorBox is at 50 Rs.
Calculate Total of all purchesed items. */
import java.util.Scanner;

public class Que11 
{

	public static void main(String[] args) 
	{
		
		Scanner sc= new Scanner(System.in);
	//	int pen,pencil,notebook,bottle,colourbox;
		boolean flag=false;
		int quantity,price,totalprice=0;
		
		System.out.println("******stationary shop items*******");
		System.out.println("1:pen");
		System.out.println("2:pencil");
		System.out.println("3:notebook");
		System.out.println("4:bottle");
		System.out.println("5:colourbox");
		
		while(flag=true)
		{
			int choice;
			System.out.println("Enter choice==>");
			choice=sc.nextInt();
			switch(choice)
			{
			case 1:
				
				System.out.println("Enter Quantity needed==>");
				quantity=sc.nextInt();
				price=10;
				totalprice=price*quantity;
				System.out.println("total price of pen==>"+totalprice);
				
				
				break;
			case 2:
				
				System.out.println("Enter Quantity needed==>");
				quantity=sc.nextInt();
				price=5;
				totalprice=price*quantity;
				System.out.println("total price of pencil==>"+totalprice);
				
				break;
			case 3:
				
				System.out.println("Enter Quantity needed==>");
				quantity=sc.nextInt();
				price=20;
				totalprice=price*quantity;
				System.out.println("total price of notebook==>"+totalprice);
				break;
			case 4:
			
				System.out.println("Enter Quantity needed==>");
				quantity=sc.nextInt();
				price=30;
				totalprice=price*quantity;
				System.out.println("total price of Bottle==>"+totalprice);
				break;
			case 5:
				
				System.out.println("Enter Quantity needed==>");
				quantity=sc.nextInt();
				price=50;
				totalprice=price*quantity;
				System.out.println("total price of colourbox==>"+totalprice);
				break;
			case 6:
				flag=false;
				System.out.println("INVALID CHOICE");
				;
			case 7 :
				break;
				
			}
		
			
			}
			
	}

}
/*output
 * ******stationary shop items*******
1:pen
2:pencil
3:notebook
4:bottle
5:colourbox
Enter choice==>
1
Enter Quantity needed==>
5
total price of pen==>50   */
