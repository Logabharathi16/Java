package errors_Exceptions;

public class Trycatch2 {
	 public static void main(String[] args) {
		    try {
		      ArithmeticException OB = new ArithmeticException("My Exception");

		      throw OB;
		    }
		    catch(Exception e) {
		      System.out.println(e.getMessage());
		    }
		  }
}
