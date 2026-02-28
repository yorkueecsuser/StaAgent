import android.support.annotation.Nullable;

class UncheckedNullableReturn {
  @Nullable
  String foo() {
    return null;
  }

  void bar() {
    System.out.println(foo().hashCode());

    // Introduced unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block will never execute because getCondition() always returns false
      System.out.println("This is an unreachable block");
    } else {
      // This block will also never execute for the same reason
      System.out.println("This is another unreachable block");
    }
  }

  private boolean getCondition() {
    // Always returns false to ensure the if-else block is unreachable
    return false;
  }
}