package fileconcept;

import java.io.*; 
public class stardardstream { 
   public static void main(String args[]) throws IOException { 
      InputStreamReader cin = null; 
      try { 
         cin = new InputStreamReader(System.in); 
         System.out.println("Enter characters, 'p' to quit."); 
         char c; 
         do { 
            c = (char) cin.read(); 
            System.out.print(c); 
         } while(c != 'p'); 
      }finally { 
         if (cin != null) { 
            cin.close(); 
         } 
      } 
   } 
} 