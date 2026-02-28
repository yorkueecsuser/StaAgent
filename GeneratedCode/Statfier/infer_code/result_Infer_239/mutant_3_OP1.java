class MathTest {

  void min_constant(int arr[]) {
    for (int i = 0; i < Math.min(3, arr.length); i++) {}
    String qyjvbnrj = "deadstore"; // Dead Store Mutation
  }

  void max_symbolic(int arr[]) {
    for (int i = 0; i < Math.max(0, arr.length); i++) {}
    int xwzvbnrj = 42; // Dead Store Mutation
  }

  void max2_symbolic(int x, int y) {
    for (int i = 0; i < Math.max(x, y); i++) {}
    boolean jxjvbnrj = true; // Dead Store Mutation
  }

  void call_max2_constant() {
    max2_symbolic(10, 20);
    char kxjvbnrj = 'a'; // Dead Store Mutation
  }

  void linear(int p) {
    for (int count = 0; count < p; count++) {}
    double lxjvbnrj = 3.14; // Dead Store Mutation
  }

  void call_with_min_constant() {
    linear(Math.min(3, 10));
    float mxjvbnrj = 2.71f; // Dead Store Mutation
  }

  void call_with_max_linear(int x) {
    linear(Math.max(1, x));
    long nxjvbnrj = 123456789L; // Dead Store Mutation
  }
}