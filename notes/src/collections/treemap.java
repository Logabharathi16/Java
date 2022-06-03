package collections;

import java.util.*;

import java.util.Map.Entry;  

public class treemap{  

 public static void main(String args[]){  

   TreeMap<Integer,String> map=new TreeMap<Integer,String>();    

      map.put(2019901,"Umer");    

      map.put(2019902,"Zainab");    

      map.put(2019903,"Sudheer");    

      map.put(2019904,"Suryaprakash");    

        

      for (Iterator<Entry<Integer, String>> iterator = map.entrySet().iterator(); iterator.hasNext();) {

Entry<Integer, String> m = iterator.next();

System.out.println(m.getKey()+" "+m.getValue());

}    

 }  

}