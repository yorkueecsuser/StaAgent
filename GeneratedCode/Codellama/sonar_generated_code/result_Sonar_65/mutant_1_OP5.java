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

    // Inserted unreachable switch statement
    switch (getCondition()) {
      case true:
        // code
        break;
      case false:
        // code
        break;
      default:
        // code
        break;
    }
  }

  // Helper method to return a boolean value
  private static boolean getCondition() {
    return false;
  }
}