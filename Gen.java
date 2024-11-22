class TwoGen<T,V>
{
T ob1;
V ob2;
public TwoGen(T o1,V o2)
{
ob1=o1;
ob2=o2;
}
public void showType()
{
System.out.println("Type of T:"+ob1.getClass().getName());
System.out.println("Type of V:"+ob2.getClass().getName());
}
T getOb1()
{
return ob1;
}
V getOb2()
{
return ob2;
}
}
public class Gen
{
public static void main(String args[])
{
TwoGen<Integer,String> tgobj=new TwoGen<Integer,String>(88,"Generics");
tgobj.showType();
int v=tgobj.getOb1();
System.out.println("value:"+v);
String str =tgobj.getOb2();
System.out.println("value:"+str);
}
}