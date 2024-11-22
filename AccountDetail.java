public class AccountDetail
{
	public static void main(String args[])
	{
		Account a1=new Account("Barath",2000);
		Account a2=new Account("Gokul",1000);
		System.out.println(a1);
		System.out.println(a2);
	}
}
class Account
{
	int no;
	String name;
	double balance;
	static int current_alloted_no=1001;
	public Account(String name,double balance)
	{
		this.no=current_alloted_no++;
		this.name=name;
		this.balance=balance;
		
	}
	public String getName()
	{
		return name;
	}
	public void  setName(String name)
	{
		this.name=name;
	}
	public double getBalance()
	{
		return balance;
	}
	public void  setBalance(double balance)
	{
		this.balance=balance;
	}
}