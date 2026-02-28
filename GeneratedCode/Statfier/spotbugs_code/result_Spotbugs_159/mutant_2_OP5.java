import androidx.annotation.Nullable;

class UncheckedNullableReturn2 {
  @Nullable
  String foo() {
    return null;
  }

  void bar() {
    System.out.println(foo().hashCode());

    // Inserting unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case will never be reached because condition is never true
        System.out.println("This is an unreachable case");
        break;
      case 1:
        // This case will always be executed
        System.out.println("This is the reachable case");
        break;
    }
  }

  private boolean getCondition() {
    // This method returns false, making the switch condition always evaluate to 1
    return false;
  }
}