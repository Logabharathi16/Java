package forEach;

import java.util.List;
import java.util.ArrayList;
public class foreachstream {
   public static void main(String[] args) {
      List<String> names = new ArrayList<String>();
      names.add("RAm");
      names.add("Krishna");
      names.add("Balaram");
      names.add("Vishnu");
      names.add("Govind");
      names.stream() //creating stream 
     .filter(f->f.startsWith("G")) //filtering names that starts with G
     .forEach(System.out::println); //displaying the stream using forEach
   }
}