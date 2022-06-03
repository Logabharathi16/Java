package forEach;

import java.util.Map;
import java.util.Scanner;
import java.util.HashMap;
public class example1 {
   public static void main(String[] args) {
      Map<Integer, String> hmap = new HashMap<Integer, String>();
      hmap.put(1, "Jamuna");
      hmap.put(2, "Nivetha"); 
      hmap.put(3, "Vishvani");  
      hmap.put(4, "Poojith");   
      hmap.put(5, "Deepalakshmi");   
      hmap.put(6, "Vamsi"); 
             
      hmap.forEach((key,value)->System.out.println(key+" - "+value));//Lamba expression with forEach()
          Scanner sc=new Scanner(System.in);
          int s;
          System.out.print("Enter the Key:  ");
          s=sc.nextInt();
      hmap.forEach((key,value)->{ 
         if(key == s){ 
            System.out.println("Value associated with key 4 is: "+value); 
         }  
      });    
      Scanner sc1=new Scanner(System.in);
      System.out.print("Enter the VAlue(Name):  ");
      String ss=sc1.nextLine();
      
     hmap.forEach((key,value)->{
         if(ss.equals(value)){ 
            System.out.println("Key associated with Value Vamsi is: "+key);
         }
         else
         {
        	 System.out.println("Value not available in the list  ");
         }
      }); 
   }
}