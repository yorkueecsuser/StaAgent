class MathTest {

  void min_constant(int arr[]) {
    for (int i = 0; i < Math.min(3, arr.length); i++) {}
    // Mutant: Renamed 'i' to 'a'
    for (int a = 0; a < Math.min(3, arr.length); a++) {}
  }

  void max_symbolic(int arr[]) {
    for (int i = 0; i < Math.max(0, arr.length); i++) {}
    // Mutant: Renamed 'i' to 'b'
    for (int b = 0; b < Math.max(0, arr.length); b++) {}
  }

  void max2_symbolic(int x, int y) {
    for (int i = 0; i < Math.max(x, y); i++) {}
    // Mutant: Renamed 'i' to 'c'
    for (int c = 0; c < Math.max(x, y); c++) {}
  }

  void call_max2_constant() {
    max2_symbolic(10, 20);
    // Mutant: Renamed 'x' to 'd' and 'y' to 'e' in the method signature and call
    max2_symbolic_d_e(10, 20);
  }

  void max2_symbolic_d_e(int d, int e) {
    for (int i = 0; i < Math.max(d, e); i++) {}
  }

  void linear(int p) {
    for (int count = 0; count < p; count++) {}
    // Mutant: Renamed 'count' to 'f'
    for (int f = 0; f < p; f++) {}
  }

  void call_with_min_constant() {
    linear(Math.min(3, 10));
    // Mutant: Renamed 'p' to 'g' in the method signature and call
    linear_g(Math.min(3, 10));
  }

  void linear_g(int g) {
    for (int count = 0; count < g; count++) {}
  }

  void call_with_max_linear(int x) {
    linear(Math.max(1, x));
    // Mutant: Renamed 'x' to 'h' in the method signature and call
    linear_h(Math.max(1, h));
  }

  void linear_h(int h) {
    for (int count = 0; count < Math.max(1, h); count++) {}
  }
}