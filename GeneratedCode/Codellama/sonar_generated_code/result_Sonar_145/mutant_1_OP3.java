import java.util.*;

class BuggyArray {
  public static void main(String[] args) {
    int[] numbers = {1, 2, 3, 4, 5};
    System.out.println("Hash code: " + numbers.hashCode()); // BUG: "hashCode" and "toString" should not be called on array instances
    System.out.println("ToString: " + numbers.toString()); // BUG: "hashCode" and "toString" should not be called on array instances
    if (getCondition()) { // Added unreachable if branch
      System.out.println("Unreachable code");
    }
  }

  // Added method to provide a non-final variable for the condition
  private static boolean getCondition() {
    return new Random().nextBoolean();
  }
}