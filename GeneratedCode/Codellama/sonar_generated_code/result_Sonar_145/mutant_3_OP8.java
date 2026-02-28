import java.util.*;

class BuggyArray {
  public static void main(String[] args) {
    int[] numbers = {1, 2, 3, 4, 5};
    System.out.println("Hash code: " + numbers.hashCode()); // BUG: "hashCode" and "toString" should not be called on array instances
    System.out.println("ToString: " + numbers.toString()); // BUG: "hashCode" and "toString" should not be called on array instances
  }
}

// Mutation 1: Renaming "numbers" to "arr"
class BuggyArray {
  public static void main(String[] args) {
    int[] arr = {1, 2, 3, 4, 5};
    System.out.println("Hash code: " + arr.hashCode()); // BUG: "hashCode" and "toString" should not be called on array instances
    System.out.println("ToString: " + arr.toString()); // BUG: "hashCode" and "toString" should not be called on array instances
  }
}

// Mutation 2: Renaming "numbers" to "list"
class BuggyArray {
  public static void main(String[] args) {
    int[] list = {1, 2, 3, 4, 5};
    System.out.println("Hash code: " + list.hashCode()); // BUG: "hashCode" and "toString" should not be called on array instances
    System.out.println("ToString: " + list.toString()); // BUG: "hashCode" and "toString" should not be called on array instances
  }
}