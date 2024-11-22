class Temperature
{
	private static int max_temp=0;
	private int temp;
	static double avg_temp;
	public Temperature(int temp)
	{
		this.temp=temp;
		if(temp>max_temp)
		max_temp=temp;
	}
	public static void display()
	{
		System.out.println("MAX"+_max_temp);
		System.out.println("AVG"+avg_temp);
		System.out.println("TEMP"+temp);
	}
}
public class Temp
{
	public static void main(String args[])
	{
		Temperature obj1=new Temperature(50);
		Temperature obj2=new Temperature(42);
		Temperature obj3=new Temperature(45);
		Temperature.avg_temp=(obj1.temp+obj2.temp+obj3.temp)/3;
		System.out.println(Temperature.max_temp);
	}
}
		