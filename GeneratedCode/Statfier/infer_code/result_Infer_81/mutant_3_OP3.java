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
    // Unreachable if statement mutation
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is an unreachable if statement");
    }
  }

  // Expected: square root(x), got T
  void square_root_variant_FP(int x) {
    int i = 0;
    while (i < x / i) {
      i++;
    }
    // Unreachable if statement mutation
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is another unreachable if statement");
    }
  }

  // Method to provide a dynamic condition
  private boolean getCondition() {
    return false;
  }
}