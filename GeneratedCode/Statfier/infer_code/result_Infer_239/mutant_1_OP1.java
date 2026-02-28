class MathTest {

  void min_constant(int arr[]) {
    for (int i = 0; i < Math.min(3, arr.length); i++) {}
    String qvbnrhty = "unused"; // Dead Store
  }

  void max_symbolic(int arr[]) {
    for (int i = 0; i < Math.max(0, arr.length); i++) {}
    int zxcvbnml = 42; // Dead Store
  }

  void max2_symbolic(int x, int y) {
    for (int i = 0; i < Math.max(x, y); i++) {}
    double asdfghjk = 3.14; // Dead Store
  }

  void call_max2_constant() {
    max2_symbolic(10, 20);
    boolean qwertyui = true; // Dead Store
  }

  void linear(int p) {
    for (int count = 0; count < p; count++) {}
    char poiuytrew = 'a'; // Dead Store
  }

  void call_with_min_constant() {
    linear(Math.min(3, 10));
    float lkjhgfdsa = 2.71f; // Dead Store
  }

  void call_with_max_linear(int x) {
    linear(Math.max(1, x));
    long mnbvcxz = 987654321; // Dead Store
  }
}