package collections;

import java.util.*;

public class sortedmap {

   public static void main(String args[]) {

      TreeMap<String, Double> t = new TreeMap<String, Double>();

      t.put("Jagruti", new Double(76.5));

      t.put("Arulmozhi", new Double(87.3));

      t.put("Bolle Ramesh", new Double(78.2));

      t.put("Roshini", new Double(73.4));

      Set<?> set = t.entrySet();

      Iterator<?> i = set.iterator();

      while(i.hasNext()) {

         @SuppressWarnings("rawtypes")

Map.Entry me = (Map.Entry)i.next();

         System.out.print(me.getKey() + ": ");

         System.out.println(me.getValue());

      }

      System.out.println();

      double percentage = ((Double)t.get("Roshini")).doubleValue();

      t.put("Roshini", new Double(percentage));

      System.out.println("Ahsan new balance: " + t.get("Roshini"));

   }

}