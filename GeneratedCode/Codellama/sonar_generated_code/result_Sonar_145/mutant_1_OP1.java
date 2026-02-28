import java.util.*;

class BuggyArray {
  public static void main(String[] args) {
    int[] numbers = {1, 2, 3, 4, 5};
    int deadStore = 1; // Dead Store Mutant
    System.out.println("Hash code: " + numbers.hashCode());
    System.out.println("ToString: " + numbers.toString());
  }
}