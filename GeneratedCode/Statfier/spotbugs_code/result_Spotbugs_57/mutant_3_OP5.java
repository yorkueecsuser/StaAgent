import android.support.annotation.NonNull;

class NullForNonNullParam {
  static void foo(@NonNull Object o) {}

  static void bar() {
    foo(null);

    // Introduced unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case will never be executed because condition is always false
        System.out.println("This is an unreachable case.");
        break;
      default:
        // Default case to avoid compiler warnings
        break;
    }
  }

  private static boolean getCondition() {
    // This method always returns false, making the switch statement unreachable
    return false;
  }
}