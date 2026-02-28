import android.support.annotation.NonNull;

class NullForNonNullParam {
  static void foo(@NonNull Object o) {}

  static void bar() {
    foo(null);

    // Unreachable for loop mutant
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is intended to be unreachable
    }
  }

  // Helper method to provide a dynamic condition
  private static boolean getCondition() {
    return false;
  }
}