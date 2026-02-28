import java.util.*;

class BuggyArray {
  public static void main(String[] args) {
    int[] numbers = {1, 2, 3, 4, 5};
    System.out.println("Hash code: " + numbers.hashCode());
    System.out.println("ToString: " + numbers.toString());

    // Mutant 1: Unreachable while loop
    boolean isNotNull = numbers!= null;
    while (false) {
      System.out.println("Unreachable while loop");
    }
  }
}