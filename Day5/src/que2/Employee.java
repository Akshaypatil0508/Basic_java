package que2;

public class Employee 
{
	private int EmpId;
	private String name;
	private String address;
	private double Salary;
	
	 public Employee(int EmpId,String name,String address,double salary)
	{
		this.EmpId=EmpId;
		this.name=name;
		this.address=address;
		this.Salary=salary;
	}
	
	public void setEmpId(int EmpId)
	{
		this.EmpId=EmpId;
		
	}
	public int getEmpId()
	{
		return EmpId;
	}
	
	public void setname(String name)
	{
		this.name=name;
	}
	
	public String getname()
	{
		return name;
	}
	
	public void Setaddress(String address)
	{
		this.address=address;
	}
	public String getaddress()
	{
		return address;
	}
	public void setsalary(double salary)
	{
		this.Salary=salary;
	}
	public double getsalary()
	{
		return Salary;
	}
	
	public void Display()
	{
		System.out.println("Employee Id==>"+EmpId);
		System.out.println("Name==>"+name);
		System.out.println("Address==>"+address);
		System.out.println("Salary==>"+Salary);
		
	}
	

}
