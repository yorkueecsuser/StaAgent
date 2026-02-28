import androidx.annotation.NonNull;

class NullForNonNullParam2 {
  static void foo(@NonNull Object o) {}

  static void bar() {
    // Inserting an unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable because getCondition() will return false
    }

    foo(null);
  }

  // Method to provide a dynamic condition for the while loop
  private static boolean getCondition() {
    return false;
  }
}