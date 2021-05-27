//9:Create Date class with  data members day,month,year.create getter setter for data members.writ display function to display date.
import java.util.Scanner;
public class Que9 {
private int date;
private int month;
private int year;

void AcceptInfo()
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the date:");
	date=sc.nextInt();
	System.out.println("enter the month:");
	month=sc.nextInt();
	System.out.println("enter the year:");
	year=sc.nextInt();
}
int getDay(int date)
{
	return this.date;
}
void setDay(int date)
{
	this.date=date;
}
int getMonth(int month)
{
	return this.month;
}
void setMonth(int month)
{
	this.month=month;
}
int getYear(int y)
{
	return this.year;
}
void setYear(int y)
{
	this.year=y;
}
public void Display() {
System.out.println("DATE="+ date+"/"+  month+"/"+  year);
}
public void DisplayNewDate() {
System.out.println("DATE="+ date+"/"+  month+"/"+ year);
}
public void DisplayNewMonth() {
System.out.println("DATE="+ date+"/"+  month+"/"+  year);
}
public void DisplayNewYear() {
System.out.println("DATE="+ date+"/"+  month+"/"+  year);
}
}
