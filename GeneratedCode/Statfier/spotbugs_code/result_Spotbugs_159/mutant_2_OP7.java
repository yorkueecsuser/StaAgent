import androidx.annotation.Nullable;

class UncheckedNullableReturn2 {
  @Nullable
  String foo() {
    return null;
  }

  void bar() {
    // Introducing an unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable because getCondition() will always return false
      System.out.println("This loop is unreachable");
    }

    System.out.println(foo().hashCode());
  }

  // Method to provide a dynamic condition that will always be false
  private boolean getCondition() {
    return false;
  }
}