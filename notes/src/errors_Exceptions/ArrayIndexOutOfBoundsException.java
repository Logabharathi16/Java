package errors_Exceptions;
public class ArrayIndexOutOfBoundsException {
	 public static void main(String args[]) {
	      try {
	         int[] a = new int[]{1,2,3,4,5};
	         //int x = 6;
	         a[9] =0 ;
	         System.out.print(a[3]);
	      } catch(Exception ex) {
	         System.out.println("Array size is restricted to 5 elements only not more than 5 your answer is not in array index");
	      }
	   }
}
