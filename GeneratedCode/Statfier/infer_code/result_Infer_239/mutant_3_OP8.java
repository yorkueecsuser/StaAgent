class MathTest {

  void min_constant(int arr[]) {
    for (int i = 0; i < Math.min(3, arr.length); i++) {}
    // Mutant
    for (int j = 0; j < Math.min(3, arr.length); j++) {}
  }

  void max_symbolic(int arr[]) {
    for (int i = 0; i < Math.max(0, arr.length); i++) {}
    // Mutant
    for (int k = 0; k < Math.max(0, arr.length); k++) {}
  }

  void max2_symbolic(int x, int y) {
    for (int i = 0; i < Math.max(x, y); i++) {}
    // Mutant
    for (int l = 0; l < Math.max(x, y); l++) {}
  }

  void call_max2_constant() {
    max2_symbolic(10, 20);
    // Mutant
    max2_symbolic(10, 20);
  }

  void linear(int p) {
    for (int count = 0; count < p; count++) {}
    // Mutant
    for (int m = 0; m < p; m++) {}
  }

  void call_with_min_constant() {
    linear(Math.min(3, 10));
    // Mutant
    linear(Math.min(3, 10));
  }

  void call_with_max_linear(int x) {
    linear(Math.max(1, x));
    // Mutant
    linear(Math.max(1, x));
  }
}