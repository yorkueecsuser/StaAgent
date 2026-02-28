import androidx.annotation.Nullable;

class UncheckedNullableReturn2 {
  @Nullable
  String foo() {
    return null;
  }

  void bar() {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that should run if shouldRun is true
      System.out.println("This code should run if shouldRun is true");
    } else {
      // Unreachable else branch
      System.out.println("This code is unreachable");
    }
    System.out.println(foo().hashCode());
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined but always returns false
  }
}