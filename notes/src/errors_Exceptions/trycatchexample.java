package errors_Exceptions;

public class trycatchexample {
	  public static void main(String args[])
	  {  
	      try
	      {   
	        System.out.println("This code is inside in the try block");  
	        int a = 2;
	        int b = 0;
	             int c = a/b;  
	        System.out.println("result of calculation = "+ c);  
	       }
	       catch (ArithmeticException e)
	      {
	           e.printStackTrace();
	        System.out.println("ArithmeticException are handled");  
	      }
	    catch (NumberFormatException e)
	      {
	           e.printStackTrace();
	        System.out.println("NumberFormatException are handled");  
	      }
	    catch (Exception e)
	      {
	           e.printStackTrace();
	        System.out.println("Exception are handled");  
	      }

	       //rest code of the program   
	       System.out.println("This code is outside from the try block");  
	  }  
	}  
