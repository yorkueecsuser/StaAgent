class MathTest {

  void min_constant(int arr[]) {
    for (int i = 0; i < Math.min(3, arr.length); i++) {}
    // Introduced unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
  }

  void max_symbolic(int arr[]) {
    for (int i = 0; i < Math.max(0, arr.length); i++) {}
    // Introduced unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable code
    }
  }

  void max2_symbolic(int x, int y) {
    for (int i = 0; i < Math.max(x, y); i++) {}
    // Introduced unreachable if statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Unreachable code
    }
  }

  void call_max2_constant() {
    max2_symbolic(10, 20);
    // Introduced unreachable switch statement
    int value = getValue();
    switch(value) {
      case 1:
        // Unreachable code
        break;
    }
  }

  void linear(int p) {
    for (int count = 0; count < p; count++) {}
    // Introduced unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
  }

  void call_with_min_constant() {
    linear(Math.min(3, 10));
    // Introduced unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable code
    }
  }

  void call_with_max_linear(int x) {
    linear(Math.max(1, x));
    // Introduced unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Unreachable code
    } else {
      // Alternative unreachable code
    }
  }

  // Helper methods to avoid compile-time constants
  private boolean getCondition() {
    return false;
  }

  private int getValue() {
    return 0;
  }
}