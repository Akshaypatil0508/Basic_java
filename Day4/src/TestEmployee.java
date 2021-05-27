
public class TestEmployee {

	public static void main(String[] args) {
	
		
		Employee e1=new Employee();
		Employee e2=new Employee();
		e1.acceptdetails();
		e1.calsalary();
		e1.displaydetails();
		e2.acceptdetails();
		e2.calsalary();
		e2.displaydetails();

	}

}
/*output
  Enter Employee ID==>
1140
Enter Employee name==>
akshay
Enter Basic Salary==>
250000
Employee id==>1140
Employee Name==>akshay
Gross salary of employee==>375500.0
Net salary of employee==>345300.0
*/