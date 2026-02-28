class CantHandle {

  // Let's collect examples that we know we can't handle

  // Intervals are limited to affine expressions, not
  // polynomials. Hence, we can't handle the below examples.

  // Expected: square root(x), got T
  void square_root_FP(int x) {
    int i = 0;
    while (i * i < x) {
      i++;
    }
    // Unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case will never be executed because condition is always false
        System.out.println("This is an unreachable case.");
        break;
    }
  }

  // Expected: square root(x), got T
  void square_root_variant_FP(int x) {
    int i = 0;
    while (i < x / i) {
      i++;
    }
    // Unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case will never be executed because condition is always false
        System.out.println("This is another unreachable case.");
        break;
    }
  }

  // Helper method to simulate a dynamic condition
  private boolean getCondition() {
    return false;
  }
}