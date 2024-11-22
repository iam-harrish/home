import java.util.*;
public class Coordinates
{
	public static void main (String args[])
	{
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter points:");
		int a=sc.nextInt(); int b=sc.nextInt();
		Point p1= new Point();
		Point p2= new Point(a,b);
		p1.display();
		p2.display();	
	}
}
class Point
{
	int x;
	int y;
	public Point()
	{
		x=0;y=0;
	}
	public Point(int a , int b)
	{
		x=a;y=b;
	}
	public void display()
	{
		if(x>=0&&y>=0)
		{
			System.out.println("I");
		}
		else if (x<0&&y>=0)
		{
			System.out.println("II");
		}
		else if (x<0&&y<0)
		{
			System.out.println("III");
		}
		else
		{
			System.out.println("IV");
		}
	}
}
