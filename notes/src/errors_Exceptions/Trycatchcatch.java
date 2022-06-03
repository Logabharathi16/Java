package errors_Exceptions;

public class Trycatchcatch {
	  public static void main(String[] args) {
		    try {
		      int num1 = 50;
		      int num2 = 0;
		      int num3 = 0;

		      num3 = num1 / num2;

		      System.out.println("Result: " + num3);
		    }
		    catch(ArithmeticException e) {
		      System.out.println(e);
		    }
		    catch(Exception e) {
		      System.out.println(e);
		    }
		  }
}
