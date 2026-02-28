import android.support.annotation.NonNull;

class NullForNonNullParam {
  static void foo(@NonNull Object o) {}

  static void bar() {
    foo(null);

    // Mutated code starts here
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block will never execute because shouldRun is always false
    } else {
      // This block will also never execute because shouldRun is always false
    }
  }

  private static boolean getCondition() {
    return false;
  }
}