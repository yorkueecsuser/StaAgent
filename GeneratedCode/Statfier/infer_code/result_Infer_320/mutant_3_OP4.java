class ExclusiveTest {

  void linear(int x) {
    for (int i = 0; i < x; i++) {}
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that will never run
      System.out.println("This is an unreachable if block");
    } else {
      // Some alternative code that will also never run
      System.out.println("This is an unreachable else block");
    }
  }

  void call_linear_exclusive_constant(int x) {
    linear(x);
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that will never run
      System.out.println("This is an unreachable if block in call_linear_exclusive_constant");
    } else {
      // Some alternative code that will also never run
      System.out.println("This is an unreachable else block in call_linear_exclusive_constant");
    }
  }

  void call_linear_exclusive_linear(int x) {
    for (int i = 0; i < x; i++) {
      linear(i);
    }
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that will never run
      System.out.println("This is an unreachable if block in call_linear_exclusive_linear");
    } else {
      // Some alternative code that will also never run
      System.out.println("This is an unreachable else block in call_linear_exclusive_linear");
    }
  }

  private boolean getCondition() {
    return false; // This method always returns false, ensuring the if-else branches are unreachable
  }
}