import java.util.*;

class CollectionSizeBug {
  public static void main(String[] args) {
    List<String> myList = new ArrayList<String>();
    String[] myArray = new String[]{"apple", "banana", "cherry"};

    if (myList.size() >= 0) {
      System.out.println("List is non-empty");
    }

    boolean result = myArray.length >= 0;
    if (result) {
      System.out.println("Array is non-empty");
    }

    // Mutant 1: Duplicate assignment statement
    boolean result1 = myArray.length >= 0;
    if (result1) {
      System.out.println("Array is non-empty");
    }
  }
}