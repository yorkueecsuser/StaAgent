import javax.annotation.Nonnull;

class Bug3587164 {
  @Nonnull static final String field1 = "yyyyMMdd";

  @Nonnull static final String field2 = field1.toLowerCase();

  // Introduced an unreachable if-else statement with a dynamic condition
  static void someMethod() {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that will run if shouldRun is true
      System.out.println("This will run if shouldRun is true.");
    } else {
      // Unreachable code due to the condition always being false
      System.out.println("This is unreachable code.");
    }
  }

  // Method to provide a dynamic condition
  private static boolean getCondition() {
    return false; // This ensures the else block is unreachable
  }
}