
public class Std 
{
	private int rollno;
	private String name;
	private int total;
	public Std(int rollno,String name,int total)
	{
		this.rollno=rollno;
		this.name=name;
		this.total=total;
	}
	public void display()
	{
		System.out.println(" "+rollno+" "+name+"  "+total);
	}

}
