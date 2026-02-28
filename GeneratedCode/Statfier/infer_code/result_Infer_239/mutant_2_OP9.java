class MathTest {

  void min_constant(int arr[]) {
    int i = 0;
    do {
    } while (i++ < Math.min(3, arr.length));
  }

  void max_symbolic(int arr[]) {
    int i = 0;
    do {
    } while (i++ < Math.max(0, arr.length));
  }

  void max2_symbolic(int x, int y) {
    int i = 0;
    do {
    } while (i++ < Math.max(x, y));
  }

  void call_max2_constant() {
    max2_symbolic(10, 20);
  }

  void linear(int p) {
    int count = 0;
    do {
    } while (count++ < p);
  }

  void call_with_min_constant() {
    linear(Math.min(3, 10));
  }

  void call_with_max_linear(int x) {
    linear(Math.max(1, x));
  }
}