import androidx.annotation.Nullable;

class UncheckedNullableReturn2 {
  @Nullable
  String foo() {
    return null;
  }

  void bar() {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This will never be printed");
    }
    System.out.println(foo().hashCode());
  }

  private boolean getCondition() {
    return false;
  }
}