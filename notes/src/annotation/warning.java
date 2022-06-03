package annotation;

import java.util.*;

class warning {
  
  @SuppressWarnings("unchecked")
static void wordsList() {
    @SuppressWarnings("rawtypes")
	ArrayList wordList = new ArrayList<>();

// This causes an unchecked warning
    wordList.add("java"); 

    System.out.println("Word list => " + wordList);
  }

  public static void main(String args[]) {
    wordsList();
  }
}
