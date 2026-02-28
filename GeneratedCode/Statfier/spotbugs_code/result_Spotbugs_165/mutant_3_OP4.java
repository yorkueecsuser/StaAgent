import javax.annotation.Nonnull;

class Bug3587164 {
  @Nonnull static final String field1 = "yyyyMMdd";

  @Nonnull static final String field2 = field1.toLowerCase();

  // Introduced an unreachable if-else statement
  public static void someMethod() {
    boolean condition = getCondition();
    if (condition) {
      // Some code that will run if condition is true
      System.out.println("This is reachable code.");
    } else {
      // Unreachable code due to condition always being false
      System.out.println("This is unreachable code.");
    }
  }

  private static boolean getCondition() {
    return false; // This method ensures the condition is always false, making the else block unreachable
  }
}