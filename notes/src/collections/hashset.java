package collections;

import java.util.*;  
public class hashset
{  
public static void main(String args[])
{  
	//Creating HashSet and adding elements  
	HashSet<String> set=new HashSet<String>();  
	set.add("SURYA");  
	set.add("RAMESH");  
	set.add("SATHYAM");  
	set.add("NITHISH");  
	//Traversing elements  
	Iterator<String> itr=set.iterator();  
	while(itr.hasNext())
	{  
		System.out.println(itr.next());  
	}  
}  
}  