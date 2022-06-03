package errors_Exceptions;

public class Exception1 {
	public static void main(String[] args) 
	        {
	        int a = 25;
	        try
	        {
	            int b = a/0;    //it will throw exception
	        }
	        catch(Exception e)
	        {
	            System.out.println(e);
	        }
	    }
	}