class Vehicle
{
	String owner_name;
	String reg_no;
	double mileage;
	public Vehicle(String owner_name,String reg_no,double mileage)
	{
		this.owner_name=owner_name;
		this.reg_no=reg_no;
		this.mileage=mileage;
	}
	public void drive()
	{
		System.out.println("I am Vehicle");
	}
}
class TwoWheeler extends Vehicle
{
	double cc;
	boolean gear_type;
	String petrol_ev;
	public TwoWheeler(String owner_name,String reg_no,double mileage,double cc,boolean gear_type,String petrol_ev)
	{
		super(owner_name,reg_no,mileage);
		this.cc=cc;
		this.gear_type=gear_type;
		this.petrol_ev=petrol_ev;
	}
	public void drive()
	{
		String v="without";
		if(gear_type)
		{
			v="with";
		}
		System.out.println(owner_name+" "+"is driving a 2 wheeler of"+" "+cc+" "+"which gives"+" "+mileage);
	}
}
public class U2P10
{
	public static void main(String args[])
	{
		TwoWheeler t=new TwoWheeler("Rahul","101",50,100,false,"ev");
		t.drive();
	}
}