import java.io.FilterInputStream;

class Bug3118278 {
  public static void main(String[] args) {
    if (System.in instanceof FilterInputStream) {
      //            System.out.println("hi");
    }

    // Mutant code starts here
    boolean condition = getCondition();
    if (condition) {
      // This is an unreachable if statement
      System.out.println("This will never be printed");
    }
  }

  private static boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined at runtime
  }
}