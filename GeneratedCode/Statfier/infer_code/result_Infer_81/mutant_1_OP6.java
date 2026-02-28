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
    // Inserting an unreachable for loop
    boolean conditionFor = getCondition();
    for (int j = 0; conditionFor; j++) {
      // This loop is unreachable because conditionFor is always false
    }
  }

  // Expected: square root(x), got T
  void square_root_variant_FP(int x) {
    int i = 0;
    while (i < x / i) {
      i++;
    }
    // Inserting an unreachable for loop
    boolean conditionFor = getCondition();
    for (int j = 0; conditionFor; j++) {
      // This loop is unreachable because conditionFor is always false
    }
  }

  // Method to provide a dynamic condition that is always false
  private boolean getCondition() {
    return false;
  }
}