package forEach;

import java.util.List;
import java.util.ArrayList;
public class foreachorder {
   public static void main(String[] args) {
      List<String> names = new ArrayList<String>();
      names.add("RAm");
      names.add("Krishna");
      names.add("Balaram");
      names.add("Vishnu");
      names.add("Govind");
      System.out.println("Print using forEach");
      names.stream() 
     .filter(f->f.startsWith("V"))
     .parallel() 
     .forEach(n->System.out.println(n)); 

     System.out.println("Print using forEachOrdered"); 
     names.stream()  
     .filter(f->f.startsWith("B"))  
     .parallel() 
     .forEachOrdered(n->System.out.println(n));
   
   }
}