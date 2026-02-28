class ExclusiveTest {

  void linear(int x) {
    for (int i = 0; i < x; i++) {}
  }

  void call_linear_exclusive_constant(int x) {
    linear(x);
  }

  void call_linear_exclusive_linear(int x) {
    for (int i = 0; i < x; i++) {
      linear(i);
    }
  }

  // Mutated code
  void linear(char z) {
    for (char j = 0; j < z; j++) {}
  }

  void call_linear_exclusive_constant(char z) {
    linear(z);
  }

  void call_linear_exclusive_linear(char z) {
    for (char j = 0; j < z; j++) {
      linear(j);
    }
  }
}