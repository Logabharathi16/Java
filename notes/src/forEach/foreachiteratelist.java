package forEach;

import java.util.List;
import java.util.ArrayList;
public class foreachiteratelist {
   public static void main(String[] args) {
      List<String> names = new ArrayList<String>();//list with forEach()
      names.add("RAhul");
      names.add("SAthyam");
      names.add("Srinivasavenkata");
      names.add("Logabharathi"); 
      names.add("Gayathri");
      names.forEach(str->System.out.println(str));	   //lambda expression in forEach Method 
   }
}
