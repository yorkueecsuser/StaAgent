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

/*
Mutation Operator Name: Renaming
Mutation Operator description: Renaming user-defined variables declared in a program. If there exist multiple variables, we randomly select one for the mutation. The new name of the variable will be in the form of [a-z].

Mutated variable: myList
Original variable name: myList
New variable name: x

Changes made:
1. In the if statement, "myList.size() >= 0" was replaced with "x.size() >= 0".
2. In the println statement, "List is non-empty" was replaced with "x is non-empty".
*/

class CollectionSizeBugMutant1 {
  public static void main(String[] args) {
    List<String> x = new ArrayList<String>();
    String[] myArray = new String[]{"apple", "banana", "cherry"};

    if (x.size() >= 0) {
      System.out.println("x is non-empty");
    }

    boolean result = myArray.length >= 0;
    if (result) {
      System.out.println("Array is non-empty");
    }
  }
}