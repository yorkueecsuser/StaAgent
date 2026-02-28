import java.io.FilterInputStream;

class Bug3118278 {
  public static void main(String[] args) {
    if (System.in instanceof FilterInputStream) {
      //            System.out.println("hi");
    }

    // Introduced mutant: Unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block is reachable if shouldRun is true
      System.out.println("This is a reachable block.");
    } else {
      // This block is unreachable because shouldRun is always false
      System.out.println("This is an unreachable block.");
    }
  }

  // Method to provide a dynamic condition
  private static boolean getCondition() {
    return false;
  }
}