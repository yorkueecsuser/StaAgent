import android.support.annotation.Nullable;

class UncheckedNullableReturn {
  @Nullable
  String foo() {
    return null;
  }

  void bar() {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable because conditionWhile will never be true
    }
    System.out.println(foo().hashCode());
  }

  private boolean getCondition() {
    return false;
  }
}