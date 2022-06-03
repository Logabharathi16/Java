package collections;

import java.util.*;

public class listinterface {

public static void main(String args[]) {

List<String> list = new ArrayList<String>();

list.add("Anjalidevati");

list.add("Prathmesh");

list.add("Monisha");

//list.add("Stacy");

for (String Students : list)

System.out.println(Students);

}

}