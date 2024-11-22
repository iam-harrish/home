class A
{
	private final void display()
	{
		System.out.println(" Thank you 1");
	}
	public void print()
	{
		System.out.println("thank you 2");
	}
}
class B extends A
{
	private static final void display()
	{
		System.out.println(" Thank you 3");
	}
	public void print()
	{
		System.out.println("thank you 4");
	}
}
public class U219
{
	public static void main(String args[])
	{
		A obj = new A();
		//obj.display();
		obj.print();
		B obj1 = new B();
		//A.display();
		obj1.print();
		A obj2 = new B();
		obj2.print();
		//obj2.display();
	}
}