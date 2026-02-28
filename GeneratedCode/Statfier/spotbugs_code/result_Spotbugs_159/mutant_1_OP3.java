import androidx.annotation.Nullable;

class UncheckedNullableReturn2 {
  @Nullable
  String foo() {
    return null;
  }

  void bar() {
    boolean condition = getCondition();
    if (condition) {
      // This is an unreachable if statement because getCondition() will never return true
      System.out.println("This is an unreachable statement");
    }
    System.out.println(foo().hashCode());
  }

  private boolean getCondition() {
    // This method always returns false, ensuring the if statement is unreachable
    return false;
  }
}