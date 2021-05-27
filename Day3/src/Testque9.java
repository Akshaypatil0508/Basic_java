import java.util.Scanner;
public class Testque9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
Que9 obj=new Que9();
obj.AcceptInfo();
obj.Display();
System.out.println("enter the new date:");
int d=sc.nextInt();
obj.setDay(d);
obj.DisplayNewDate();
System.out.println("enter new month:");
int m=sc.nextInt();
obj.setMonth(m);
obj.DisplayNewMonth();
System.out.println("enter the new year:");
int y=sc.nextInt();
obj.setYear(y);
obj.DisplayNewYear();
}
}

/*output
enter the date:
05
enter the month:
08
enter the year:
1996
DATE=5/8/1996
*/