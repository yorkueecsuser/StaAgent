class ExclusiveTest {

  void linear(int x) {
    for (int i = 0; i < x; i++) {}
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block is intended to be unreachable
    } else {
      // Alternative code
    }
  }

  void call_linear_exclusive_constant(int x) {
    linear(x);
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block is intended to be unreachable
    } else {
      // Alternative code
    }
  }

  void call_linear_exclusive_linear(int x) {
    for (int i = 0; i < x; i++) {
      linear(i);
    }
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block is intended to be unreachable
    } else {
      // Alternative code
    }
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined but returns false
  }
}