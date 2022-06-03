package errors_Exceptions;

public class Runtimeerror {
			public static void main(String args[]) {
		   int a = 10;
		   int b = 5;
		   int c = 5;
		  int x = a / (b - c);//run time error
		   System.out.println("x = " + x);
		   int y = a / (b + c);
		   System.out.println("y = " + y);
		 }
		}