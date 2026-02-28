import android.support.annotation.NonNull;

class NullForNonNullParam {
  static void foo(@NonNull Object o) {}

  static void bar() {
    foo(null);

    // Introduced an unreachable if statement according to the mutation operator
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because getCondition() will never return true
      System.out.println("This is an unreachable statement.");
    }
  }

  // Helper method to ensure the condition is dynamically determined at runtime
  private static boolean getCondition() {
    return false;
  }
}