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

  // Mutant 1: Renaming variable 'x' to 'y' in method linear
  void linear_mutant1(int y) {
    for (int i = 0; i < y; i++) {}
  }

  // Mutant 2: Renaming variable 'x' to 'z' in method call_linear_exclusive_constant
  void call_linear_exclusive_constant_mutant2(int z) {
    linear(z);
  }

  // Mutant 3: Renaming variable 'x' to 'w' in method call_linear_exclusive_linear
  void call_linear_exclusive_linear_mutant3(int w) {
    for (int i = 0; i < w; i++) {
      linear(i);
    }
  }
}