class leaf
{
	int i;
	public leaf(int i)
	{
		this.i=i;
	}
	public leaf increment()
	{
		i++;
		return this;
	}
	public void print()
	{
		System.out.println(i);
	}
}
public class t1
{
	public static void main(String args[])
	{
		leaf bananaleaf=new leaf(5);
		bananaleaf.increment().increment().print();
	}
}