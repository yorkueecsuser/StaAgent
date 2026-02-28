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

    // Mutation Operator: Unreachable if-else statement
    // Description: Inserting unreachable if-else branch into a randomly selected basic block in the program. The condition of the inserted branch is always false to make it unreachable.
    if (false) {
      System.out.println("This message will never be printed");
    } else {
      System.out.println("This message will always be printed");
    }
  }
}