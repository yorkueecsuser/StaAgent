import java.util.*;

class BuggyArray {
  public static void main(String[] args) {
    int[] numbers = {1, 2, 3, 4, 5};
    System.out.println("Hash code: " + numbers.hashCode()); // BUG: "hashCode" and "toString" should not be called on array instances
    System.out.println("ToString: " + numbers.toString()); // BUG: "hashCode" and "toString" should not be called on array instances
    
    // Mutant code added to demonstrate the Renaming mutation operator
    int[] nums = {1, 2, 3, 4, 5};
    System.out.println("Hash code: " + nums.hashCode()); // Renamed "numbers" to "nums"
    System.out.println("ToString: " + nums.toString()); // Renamed "numbers" to "nums"
  }
}