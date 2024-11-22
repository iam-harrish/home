abstract class Person
{
	String name;	
	String dob;
	public Person(String name,String dob)
	{
		this.name=name;	
		this.dob=dob;
	}
	abstract public void financialstatus();
}
class Employee extends Person
{
	int id;
	double salary;
	public Employee(String name,String dob,int id,double salary)
	{
		super(name,dob);
		this.id=id;
		this.salary=salary;
	}
	public void financialstatus()
	{
		if(salary>=100000)
		{
			System.out.println(name+" "+"is HIGH CLASS");
		}
		else if(salary<=50000)
		{
			System.out.println(name+" "+"is LOW CLASS");
		}
		else
		{
			System.out.println(name+" "+"is MIDDLE CLASS");
		}
	}
}
public class Salary
{
	public static void main(String args[])
	{
		Employee e1=new Employee("HARRISH","07/10/2004",1001,65000);
		Employee e2=new Employee("BARATH","03/12/2004",1002,120000);
		e1.financialstatus();
		e2.financialstatus();
	}
}
		






















