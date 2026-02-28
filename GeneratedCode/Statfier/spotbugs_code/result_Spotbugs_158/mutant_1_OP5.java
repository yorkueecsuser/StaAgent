import android.support.annotation.Nullable;

class UncheckedNullableReturn {
  @Nullable
  String foo() {
    return null;
  }

  void bar() {
    System.out.println(foo().hashCode());

    // Introduced unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is never true
        System.out.println("This will never be printed");
        break;
      default:
        // This is the only reachable case
        System.out.println("This is the reachable case");
        break;
    }
  }

  private boolean getCondition() {
    // This method always returns false, ensuring the switch case is unreachable
    return false;
  }
}