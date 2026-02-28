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

    // Mutation Operator: Unreachable switch statement
    int value = getValue();
    switch(value) {
      case 1:
        break;
      default:
        System.out.println("Unreachable code executed");
    }
  }

  private static int getValue() {
    return 0;
  }
}