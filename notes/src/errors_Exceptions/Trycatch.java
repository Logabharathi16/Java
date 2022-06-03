package errors_Exceptions;

public class Trycatch {
		  public static void main(String[] args) {
		    try {
		      int num1 = 10;
		      double num2 = 1.0;
		      int num3 = 0;

		      num3 = num1 / num1;

		      System.out.println("Result: " + num3);
		    }
		    catch(ArithmeticException e) {
		      System.out.println("in computer never consider infinitive symbol or process(a/0 not accept)");
		    }

		  }
		}

