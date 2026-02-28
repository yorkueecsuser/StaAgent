import android.support.annotation.NonNull;

class NullForNonNullParam {
  static void foo(@NonNull Object o) {}

  static void bar() {
    foo(null);

    // Introduced an unreachable if statement with a dynamically determined condition
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This will never be printed");
    }
  }

  // Method to provide a dynamically determined condition
  private static boolean getCondition() {
    return false; // This method always returns false, ensuring the if block is unreachable
  }
}