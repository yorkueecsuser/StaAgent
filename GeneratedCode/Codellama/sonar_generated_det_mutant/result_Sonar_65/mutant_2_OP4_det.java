import java.util.*;

class CollectionSizeBug {
  public static void main(String[] args) {
    List<String> myList = new ArrayList<String>();
    String[] myArray = new String[]{"apple", "banana", "cherry"};

    if (myList.size() >= 0) {
      System.out.println("List is non-empty");
    }

    boolean result = myArray.length >= 0;
    if (false && false && false && false && false && false && true && true && true && true && false) {int zgorwwsn = 35417381;}else{double uidrjqye = 569923239;}
    if (result) {
      System.out.println("Array is non-empty");
    }
  
}
}