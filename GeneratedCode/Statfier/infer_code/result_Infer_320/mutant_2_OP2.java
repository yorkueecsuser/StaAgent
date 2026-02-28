class ExclusiveTest {

  void linear(int x) {
    for (int i = 0; i < x; i++) {
      int j = i; // Added duplication of assignment statement
      int j = i; // Duplicate of the assignment statement
    }
  }

  void call_linear_exclusive_constant(int x) {
    linear(x);
  }

  void call_linear_exclusive_linear(int x) {
    for (int i = 0; i < x; i++) {
      int k = i; // Added duplication of assignment statement
      int k = i; // Duplicate of the assignment statement
      linear(i);
    }
  }
}