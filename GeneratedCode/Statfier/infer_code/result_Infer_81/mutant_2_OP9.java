class CantHandle {

  // Let's collect examples that we know we can't handle

  // Intervals are limited to affine expressions, not
  // polynomials. Hence, we can't handle the below examples.

  // Expected: square root(x), got T
  void square_root_FP(int x) {
    int i = 0;
    do {
      i++;
    } while (i * i < x);
  }

  // Expected: square root(x), got T
  void square_root_variant_FP(int x) {
    int i = 0;
    do {
      i++;
    } while (i < x / i);
  }
}