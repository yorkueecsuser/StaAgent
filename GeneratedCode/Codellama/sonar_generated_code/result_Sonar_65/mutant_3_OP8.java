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
  }
}

// Mutant 1: Renaming the variable "myList" to "list"
class CollectionSizeBug {
  public static void main(String[] args) {
    List<String> list = new ArrayList<String>();
    String[] myArray = new String[]{"apple", "banana", "cherry"};

    if (list.size() >= 0) {
      System.out.println("List is non-empty");
    }

    boolean result = myArray.length >= 0;
    if (result) {
      System.out.println("Array is non-empty");
    }
  }
}

// Mutant 2: Renaming the variable "myArray" to "array"
class CollectionSizeBug {
  public static void main(String[] args) {
    List<String> myList = new ArrayList<String>();
    String[] array = new String[]{"apple", "banana", "cherry"};

    if (myList.size() >= 0) {
      System.out.println("List is non-empty");
    }

    boolean result = array.length >= 0;
    if (result) {
      System.out.println("Array is non-empty");
    }
  }
}