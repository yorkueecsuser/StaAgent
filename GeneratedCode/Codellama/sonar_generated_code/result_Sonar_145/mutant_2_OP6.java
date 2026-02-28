import java.util.*;

class BuggyArray {
  public static void main(String[] args) {
    int[] numbers = {1, 2, 3, 4, 5};
    System.out.println("Hash code: " + numbers.hashCode()); // BUG: "hashCode" and "toString" should not be called on array instances
    System.out.println("ToString: " + numbers.toString()); // BUG: "hashCode" and "toString" should not be called on array instances
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // unreachable code
      System.out.println("Unreachable code: " + numbers[i]);
    }
  }
  public static boolean getCondition() {
    return false;
  }
}