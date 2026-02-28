import android.support.annotation.Nullable;

class UncheckedNullableReturn {
  @Nullable
  String foo() {
    return null;
  }

  void bar() {
    // Introduced an unreachable while loop with a dynamic condition
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable because getCondition() will always return false
    }

    System.out.println(foo().hashCode());
  }

  // Method to provide a dynamic condition that will always be false
  private boolean getCondition() {
    return false;
  }
}