package errors_Exceptions;

public class Tryfinally {

	  public static void main(String[] args) {
	    try {
	      int num1 = 10;
	      int num2 = 0;
	      int num3 = 0;

	      num3 = num1 / num2;

	      System.out.println("Result: " + num3);
	    }
	    finally {
	      System.out.println("Finally block executed...");
	    }
	  }
}
