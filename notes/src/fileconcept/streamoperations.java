package fileconcept;

import java.util.*;
import java.util.stream.*;
public class streamoperations {
   public static void main(String args[]) {
      List<Integer> list1 = Arrays.asList(11,22,44,21); //creating an integer list
      List<String> id = Arrays.asList("Objects","Classes","Methods");
      //creating a String list
      // map method
      List<Integer> answer = list1.stream().map(x -> x*x).collect(Collectors.toList());
      System.out.println(answer);
      // filter method
      List<String> output = id.stream().filter(x->x.startsWith("M")).collect(Collectors.toList());
      System.out.println(output);
   }
}