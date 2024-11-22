import java.util.*;
public class U3P1
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		String ap="gopu";
		for(int i=0;i<a;i++)
		{
			try
			{	
				System.out.println(a/(1-i));
			}catch(ArithmeticException e)
			{
				System.out.println("Sorry Error");
			}
		}
		System.out.println("Thank You");
	}
}