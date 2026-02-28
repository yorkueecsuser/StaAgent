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
      // This block is unreachable because shouldRun will always be false
    }
  }

  // Method to provide a dynamic condition
  private static boolean getCondition() {
    return false;
  }
}