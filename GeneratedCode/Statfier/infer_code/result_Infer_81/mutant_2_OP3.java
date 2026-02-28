class CantHandle {

  // Let's collect examples that we know we can't handle

  // Intervals are limited to affine expressions, not
  // polynomials. Hence, we can't handle the below examples.

  // Expected: square root(x), got T
  void square_root_FP(int x) {
    int i = 0;
    while (i * i < x) {
      i++;
      boolean condition = getCondition();
      if (condition) {
        // Unreachable code
        System.out.println("This is unreachable");
      }
    }
  }

  // Expected: square root(x), got T
  void square_root_variant_FP(int x) {
    int i = 0;
    while (i < x / i) {
      i++;
      boolean condition = getCondition();
      if (condition) {
        // Unreachable code
        System.out.println("This is also unreachable");
      }
    }
  }

  private boolean getCondition() {
    return false; // This method will always return false, making the if statement unreachable
  }
}