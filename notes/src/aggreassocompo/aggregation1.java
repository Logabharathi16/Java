package aggreassocompo;

class Employees
{
  String name;
  int id ;
  String dept;
  Employees(String name, int id, String dept)
  {
    this.name = name;
    this.id = id;
    this.dept = dept;
    System.out.println("Employee name is "+name+" Id is "+id+" Department is "+dept);
  }
}
class Department
{
  String name, employees;
  Department(String name, String employees)
  {
    this.name = name;
    this.employees = employees;
  }

}
class Organization
{
  String officeName,departments;
  Organization(String officeName, String departments)
  {
    this.officeName = officeName;
    this.departments = departments;
  }

}

public class aggregation1{
  public static void main (String[] args)
  {
    Employees s1 = new Employees("Surya", 1, "Sales");
    Employees s2 = new Employees("Priya", 2, "Marketing");
    Employees s3 = new Employees("Revathi", 1, "IT");
    Employees s4 = new Employees("Sathyam", 2, "Designing");
  }
}