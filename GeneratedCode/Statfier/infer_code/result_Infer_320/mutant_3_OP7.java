class ExclusiveTest {

  void linear(int x) {
    for (int i = 0; i < x; i++) {}

    // Introduced unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
  }

  void call_linear_exclusive_constant(int x) {
    linear(x);

    // Introduced unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
  }

  void call_linear_exclusive_linear(int x) {
    for (int i = 0; i < x; i++) {
      linear(i);
    }

    // Introduced unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
  }

  // Method to provide a dynamic condition for the while loop
  private boolean getCondition() {
    return false; // This will always return false, but it's dynamically determined
  }
}