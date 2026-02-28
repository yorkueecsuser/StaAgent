class MathTest {

  void min_constant(int arr[]) {
    for (int i = 0; i < Math.min(3, arr.length); i++) {}
    // Mutant: Renaming 'i' to 'a'
    for (int a = 0; a < Math.min(3, arr.length); a++) {}
  }

  void max_symbolic(int arr[]) {
    for (int i = 0; i < Math.max(0, arr.length); i++) {}
    // Mutant: Renaming 'i' to 'b'
    for (int b = 0; b < Math.max(0, arr.length); b++) {}
  }

  void max2_symbolic(int x, int y) {
    for (int i = 0; i < Math.max(x, y); i++) {}
    // Mutant: Renaming 'i' to 'c'
    for (int c = 0; c < Math.max(x, y); c++) {}
  }

  void call_max2_constant() {
    max2_symbolic(10, 20);
    // Mutant: Renaming 'x' to 'd' and 'y' to 'e'
    max2_symbolic(10, 20);
  }

  void linear(int p) {
    for (int count = 0; count < p; count++) {}
    // Mutant: Renaming 'count' to 'f'
    for (int f = 0; f < p; f++) {}
  }

  void call_with_min_constant() {
    linear(Math.min(3, 10));
    // Mutant: Renaming 'p' to 'g'
    linear(Math.min(3, 10));
  }

  void call_with_max_linear(int x) {
    linear(Math.max(1, x));
    // Mutant: Renaming 'x' to 'h'
    linear(Math.max(1, x));
  }
}