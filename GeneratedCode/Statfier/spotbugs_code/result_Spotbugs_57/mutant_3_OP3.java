import android.support.annotation.NonNull;

class NullForNonNullParam {
  static void foo(@NonNull Object o) {}

  static void bar() {
    foo(null);

    // Mutant code start
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is an unreachable statement.");
    }
    // Mutant code end
  }

  // Helper method to provide a dynamic condition
  private static boolean getCondition() {
    return false;
  }
}