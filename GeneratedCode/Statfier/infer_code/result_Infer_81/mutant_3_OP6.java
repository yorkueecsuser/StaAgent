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
    // Unreachable for loop mutant
    boolean conditionFor = getCondition();
    for (int j = 0; conditionFor; j++) {
      // This loop is unreachable because conditionFor will always be false
    }
  }

  // Expected: square root(x), got T
  void square_root_variant_FP(int x) {
    int i = 0;
    while (i < x / i) {
      i++;
    }
    // Unreachable for loop mutant
    boolean conditionForVariant = getCondition();
    for (int j = 0; conditionForVariant; j++) {
      // This loop is unreachable because conditionForVariant will always be false
    }
  }

  // Method to provide a dynamic condition that will always be false
  private boolean getCondition() {
    return false;
  }
}