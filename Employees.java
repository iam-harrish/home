
import java .util.*;
class Emp
{
  int id;
  String name;
  double salary;
  Emp(int id,String name, double salary)
  {
    this. id=id;
    this . name = name;
    this . salary = salary;
  }
  void setId(int id)
  {
    this. id= id;
  }
  void setName(String name)
  {
    this. name= name;
  }
  void setSalary(double salary)
  {
    this. salary= salary;
  }
  int getId()
  {
    return id;
  }
  double getSalary()
  {
    return salary;
  }
  String getName()
  {
    return name;
  }
  void display()
  {
    System. out. println("\nName:"+name+"\nId:"+id+"\nSalary:"+salary);
  }
}
public class Employees
{
  public static void main(String[] args)
  {
    int i, j, n;
    System. out. println("Enter the number of employees");
    Scanner scr= new Scanner(System.in);
    n=scr.nextInt();
    Emp e[] = new Emp[n];

    for(i=0;i<n;i++)
    {
      
      System.out.println("Enter id:");
      int id=scr.nextInt();
      System.out.println("Enter name");
      String name=scr.next();
      System.out.println("Enter salary");
      double salary=scr.nextDouble();
      e[i]= new Emp(id,name,salary);
    }
    for(i=0;i<n;i++)
    {
        for(j=i+1;j<n;j++)
        {   if(e[i].getSalary()>e[j].getSalary())
            {
                Emp temp= e[i];
                e[i]=e[j];
                e[j]=temp;
            }
 
             
        }
    }
    for(i=0;i<n;i++)
    {
        e[i].display();
    }
  }
}


