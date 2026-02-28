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
    // Inserting an unreachable while loop
    boolean conditionWhile = getUnreachableCondition();
    while (conditionWhile) {
      // This loop is unreachable
      i--;
    }
  }

  // Expected: square root(x), got T
  void square_root_variant_FP(int x) {
    int i = 0;
    while (i < x / i) {
      i++;
    }
    // Inserting an unreachable while loop
    boolean conditionWhile = getUnreachableCondition();
    while (conditionWhile) {
      // This loop is unreachable
      i--;
    }
  }

  // Method to provide a dynamically determined false condition
  private boolean getUnreachableCondition() {
    return false;
  }
}