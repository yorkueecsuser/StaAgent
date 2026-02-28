import java.util.*;

class BuggyArray {
  public static void main(String[] args) {
    int[] numbers = {1, 2, 3, 4, 5};
    System.out.println("Hash code: " + numbers.hashCode()); // BUG: "hashCode" and "toString" should not be called on array instances
    System.out.println("ToString: " + numbers.toString()); // BUG: "hashCode" and "toString" should not be called on array instances

    // Mutant 1 - Unreachable switch statement
    switch (getRandomNumber() % 2) {
      case 0:
        System.out.println("Unreachable code");
        break;
      case 1:
        System.out.println("Unreachable code");
        break;
      default:
        System.out.println("Unreachable code");
        break;
    }
  }

  // Helper method to generate a random number
  private static int getRandomNumber() {
    return (int) (Math.random() * 10);
  }
}