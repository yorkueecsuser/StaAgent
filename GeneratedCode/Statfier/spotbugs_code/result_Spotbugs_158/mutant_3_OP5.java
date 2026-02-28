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
        // This case will never be reached because condition is always false
        System.out.println("This is an unreachable case");
        break;
      case 1:
        // This case is always reached
        System.out.println("This is the reachable case");
        break;
    }
  }

  private boolean getCondition() {
    // This method returns false, ensuring the switch statement is unreachable
    return false;
  }
}