package annotation;

class Base
{
     public void display()
     {
         System.out.println("Base display()");
     }

	public void display(int x) {
		// TODO Auto-generated method stub
		
	}
}
class example1 extends Base
{
     @Override
     public void display(int x)
     {
         System.out.println("Derived display(int )");
     }
     public static void main(String args[])
     {
         example1 obj = new example1();
         obj.display();
     }
}