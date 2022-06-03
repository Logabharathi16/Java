package errors_Exceptions;
import java.lang.Error;
public class TryCatchblock {
	   public static void main (String [] args) throws ArithmeticException 
	    {
	        try
	        {
	            int a = 2/0;
	        }
	        catch(ArithmeticException ex)
	        {
	            System.out.println(ex);
	        }
	        catch(Exception e)
	        {
	            System.out.println("Exception : Divide by Zero");
	        }
	        
	        finally 
	        {
	            System.out.println("You want to update your java programming knowledge 2");
	        }
	    }
	}
