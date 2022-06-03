package errors_Exceptions;

public class TryCatch1 {
	 public static void main(String []args)
     {
        int Arr[] = { 5, 4, 3, 2, 1 };
        int loop=0;

        try
        {
            for(loop=0;loop<=5;loop++)
                System.out.println(Arr[loop]);
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
     }

}
