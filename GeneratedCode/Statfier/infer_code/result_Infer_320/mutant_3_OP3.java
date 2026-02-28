class ExclusiveTest {

  void linear(int x) {
    for (int i = 0; i < x; i++) {}
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is an unreachable statement.");
    }
  }

  void call_linear_exclusive_constant(int x) {
    linear(x);
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is another unreachable statement.");
    }
  }

  void call_linear_exclusive_linear(int x) {
    for (int i = 0; i < x; i++) {
      linear(i);
      boolean condition = getCondition();
      if (condition) {
        // Unreachable code
        System.out.println("Yet another unreachable statement.");
      }
    }
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined but always false
  }
}