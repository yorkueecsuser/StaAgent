class MathTest {

  void min_constant(int arr[]) {
    for (int i = 0; i < Math.min(3, arr.length); i++) {}
    String vjklmnop = "unused"; // Dead store
  }

  void max_symbolic(int arr[]) {
    for (int i = 0; i < Math.max(0, arr.length); i++) {}
    int abcdefgh = 42; // Dead store
  }

  void max2_symbolic(int x, int y) {
    for (int i = 0; i < Math.max(x, y); i++) {}
    double qrstuvwx = 3.14; // Dead store
  }

  void call_max2_constant() {
    max2_symbolic(10, 20);
    boolean yzabcdef = true; // Dead store
  }

  void linear(int p) {
    for (int count = 0; count < p; count++) {}
    char hijklmno = 'a'; // Dead store
  }

  void call_with_min_constant() {
    linear(Math.min(3, 10));
    float pqrstuvw = 2.71f; // Dead store
  }

  void call_with_max_linear(int x) {
    linear(Math.max(1, x));
    long xyzabcde = 100L; // Dead store
  }
}