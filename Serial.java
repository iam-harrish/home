import java.io.*;
class Student implements Serializable 
{
String name;
int bno;
Student(String name,int bno)
{
this.name=name;
this.bno=bno;
}
void display()
{
System.out.println("NAME:"+name);
System.out.println("BATCH NO:"+bno);
}
}
public class Serial
{
public static void main(String args[])
{
Student s=new Student("GOPU",1001);
FileOutputStream fos=new FileOutputStream("Stud.doc");
ObjectOutputStream oos=new ObjectOutputStream(fos);
oos.writobject(s);
}
}
