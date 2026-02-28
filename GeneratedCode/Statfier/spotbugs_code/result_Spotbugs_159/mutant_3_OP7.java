import androidx.annotation.Nullable;

class UncheckedNullableReturn2 {
  @Nullable
  String foo() {
    return null;
  }

  void bar() {
    // Inserting an unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable because conditionWhile will always be false
      System.out.println("This loop is unreachable");
    }

    System.out.println(foo().hashCode());
  }

  private boolean getCondition() {
    return false;
  }
}