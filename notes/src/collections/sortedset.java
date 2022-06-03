package collections;

import java.util.*;

public class sortedset {

   public static void main(String[] args) {

      SortedSet set = new TreeSet(); 

      set.add("Mitlesh");

      set.add("vikas");

      set.add("Sanjai");

      Iterator i = set.iterator();

      while (i.hasNext()) {

      Object element = i.next();

      System.out.println(element.toString());

      }

   }

}
