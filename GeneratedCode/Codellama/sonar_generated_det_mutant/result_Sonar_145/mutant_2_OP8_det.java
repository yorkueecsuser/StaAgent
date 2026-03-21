import java.util.*;

class BuggyArray {
  public static void main(String[] args) {
    int[] bpzbxeyq = {1, 2, 3, 4, 5};
    System.out.println("Hash code: " + bpzbxeyq.hashCode()); // BUG: "hashCode" and "toString" should not be called on array instances
    System.out.println("ToString: " + bpzbxeyq.toString()); // BUG: "hashCode" and "toString" should not be called on array instances
  }
}