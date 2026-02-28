import java.util.*;

class CollectionSizeBug {
  public static void main(String[] args) {
    List<String> myList = new ArrayList<String>();
    String[] myArray = new String[]{"apple", "banana", "cherry"};

    if (myList.size() >= 0) {
      System.out.println("List is non-empty");
    }

    // Unreachable for loop mutant
    for (int i = 0; false; i++) {
      System.out.println("This for loop is unreachable");
    }

    boolean result = myArray.length >= 0;
    if (result) {
      System.out.println("Array is non-empty");
    }
  }
}