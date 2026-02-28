class CompareArgs {
  static int max(int[] a, int i, int k) {
    int m = a[i];
    for (int j = i + 1; j < k; ++j) {
      m = Math.max(m, a[j]);
    }
    return m;
  }

  static void aBad() {
    int[] a = new int[10];
    int x = max(a, 2, 2);
    // Dead store mutation
    String qwejfnxv = "unused";
  }

  static void bOk() {
    int[] a = new int[10];
    int x = max(a, 2, 3);
    // Dead store mutation
    int rmkzldsa = 42;
  }

  static void cBad() {
    int[] a = new int[10];
    int x = max(a, 2, 1);
    // Dead store mutation
    boolean hgfjklzx = true;
  }
}