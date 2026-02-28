import android.support.annotation.NonNull;

class NullForNonNullParam {
  static void foo(@NonNull Object o) {}

  static void bar() {
    foo(null);

    // Introduced unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      // This block will never execute because getCondition() always returns false
      System.out.println("This is an unreachable block");
    } else {
      // This block also will never execute due to the same reason
      System.out.println("This is another unreachable block");
    }
  }

  // Method to provide a dynamic condition that always returns false
  private static boolean getCondition() {
    return false;
  }
}