import javax.annotation.Nonnull;

class Bug3587164 {
  @Nonnull static final String field1 = "yyyyMMdd";

  @Nonnull static final String field2 = field1.toLowerCase();

  // Added mutant code with an unreachable if-else statement
  static void checkCondition() {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      System.out.println("This will run if shouldRun is true.");
    } else {
      // This is the unreachable branch
      System.out.println("This will never run because shouldRun is always false.");
    }
  }

  private static boolean getCondition() {
    return false; // This method always returns false, making the else branch unreachable
  }
}