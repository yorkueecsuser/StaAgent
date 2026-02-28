import androidx.annotation.NonNull;

class NullForNonNullParam2 {
  static void foo(@NonNull Object o) {}

  static void bar() {
    foo(null);

    // Mutant code starts here
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block is reachable if shouldRun is true
    } else {
      // This block is unreachable if shouldRun is false
      System.out.println("This is an unreachable else block.");
    }
  }

  // Method to provide a dynamic condition
  private static boolean getCondition() {
    return false; // This ensures the else block is unreachable but avoids compile-time constant issues
  }
}