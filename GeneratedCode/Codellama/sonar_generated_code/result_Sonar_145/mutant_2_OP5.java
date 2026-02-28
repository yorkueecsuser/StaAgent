import java.util.*;

class BuggyArray {
  public static void main(String[] args) {
    int[] numbers = {1, 2, 3, 4, 5};
    System.out.println("Hash code: " + numbers.hashCode()); // BUG: "hashCode" and "toString" should not be called on array instances
    System.out.println("ToString: " + numbers.toString()); // BUG: "hashCode" and "toString" should not be called on array instances

    // Unreachable switch statement
    boolean flag = false;
    switch (flag) {
        case true:
            System.out.println("Unreachable code");
            break;
        default:
            System.out.println("Default case");
            break;
    }
  }
}