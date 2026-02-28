class MathTest {

  void min_constant(int arr[]) {
    for (int i = 0; i < Math.min(3, arr.length); i++) {
      int temp = i; // Original assignment
      int temp2 = i; // Mutated duplicate
    }
  }

  void max_symbolic(int arr[]) {
    for (int i = 0; i < Math.max(0, arr.length); i++) {
      int temp = i; // Original assignment
      int temp2 = i; // Mutated duplicate
    }
  }

  void max2_symbolic(int x, int y) {
    for (int i = 0; i < Math.max(x, y); i++) {
      int temp = i; // Original assignment
      int temp2 = i; // Mutated duplicate
    }
  }

  void call_max2_constant() {
    max2_symbolic(10, 20);
  }

  void linear(int p) {
    for (int count = 0; count < p; count++) {
      int temp = count; // Original assignment
      int temp2 = count; // Mutated duplicate
    }
  }

  void call_with_min_constant() {
    linear(Math.min(3, 10));
    int result = Math.min(3, 10); // Original assignment
    int result2 = Math.min(3, 10); // Mutated duplicate
  }

  void call_with_max_linear(int x) {
    linear(Math.max(1, x));
    int result = Math.max(1, x); // Original assignment
    int result2 = Math.max(1, x); // Mutated duplicate
  }
}