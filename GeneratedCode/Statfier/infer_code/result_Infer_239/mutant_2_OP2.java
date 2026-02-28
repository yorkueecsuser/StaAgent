class MathTest {

  void min_constant(int arr[]) {
    for (int i = 0; i < Math.min(3, arr.length); i++) {}
    for (int i = 0; i < Math.min(3, arr.length); i++) {} // Mutant: duplicated the loop
  }

  void max_symbolic(int arr[]) {
    for (int i = 0; i < Math.max(0, arr.length); i++) {}
    for (int i = 0; i < Math.max(0, arr.length); i++) {} // Mutant: duplicated the loop
  }

  void max2_symbolic(int x, int y) {
    for (int i = 0; i < Math.max(x, y); i++) {}
    for (int i = 0; i < Math.max(x, y); i++) {} // Mutant: duplicated the loop
  }

  void call_max2_constant() {
    max2_symbolic(10, 20);
    max2_symbolic(10, 20); // Mutant: duplicated the method call
  }

  void linear(int p) {
    for (int count = 0; count < p; count++) {}
    for (int count = 0; count < p; count++) {} // Mutant: duplicated the loop
  }

  void call_with_min_constant() {
    linear(Math.min(3, 10));
    linear(Math.min(3, 10)); // Mutant: duplicated the method call
  }

  void call_with_max_linear(int x) {
    linear(Math.max(1, x));
    linear(Math.max(1, x)); // Mutant: duplicated the method call
  }
}