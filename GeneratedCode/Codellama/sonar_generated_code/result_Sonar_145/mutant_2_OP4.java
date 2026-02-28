import java.util.*;

class BuggyArray {
  public static void main(String[] args) {
    int[] numbers = {1, 2, 3, 4, 5};
    System.out.println("Hash code: " + numbers.hashCode()); // BUG: "hashCode" and "toString" should not be called on array instances
    System.out.println("ToString: " + numbers.toString()); // BUG: "hashCode" and "toString" should not be called on array instances

    // Insert unreachable if-else branch
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("Unreachable code executed");
    } else {
      // Reachable code
      System.out.println("Reachable code executed");
    }
  }

  private static boolean getCondition() {
    // Return a randomly generated boolean value
    return Math.random() > 0.5;
  }
}