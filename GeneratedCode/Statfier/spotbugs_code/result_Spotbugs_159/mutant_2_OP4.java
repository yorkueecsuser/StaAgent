import androidx.annotation.Nullable;

class UncheckedNullableReturn2 {
  @Nullable
  String foo() {
    return null;
  }

  void bar() {
    System.out.println(foo().hashCode());

    // Inserting unreachable if-else branch
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block will never execute because shouldRun is always false
      System.out.println("This is an unreachable if block");
    } else {
      // This block will also never execute because shouldRun is always false
      System.out.println("This is an unreachable else block");
    }
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined but always returns false
  }
}