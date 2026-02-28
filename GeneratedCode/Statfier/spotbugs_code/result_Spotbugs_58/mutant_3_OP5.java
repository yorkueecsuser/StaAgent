import androidx.annotation.NonNull;

class NullForNonNullParam2 {
  static void foo(@NonNull Object o) {}

  static void bar() {
    foo(null);

    // Introduced unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case will never be reached because condition is never true
        System.out.println("This is an unreachable case.");
        break;
      case 1:
        // This case will always be executed
        System.out.println("This is the reachable case.");
        break;
    }
  }

  private static boolean getCondition() {
    return false;
  }
}