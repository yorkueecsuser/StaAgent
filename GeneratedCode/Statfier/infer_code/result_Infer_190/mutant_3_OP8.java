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
  }

  static void bOk() {
    int[] a = new int[10];
    int x = max(a, 2, 3);
  }

  static void cBad() {
    int[] a = new int[10];
    int x = max(a, 2, 1);
  }

  // Mutated code
  static int max(int[] b, int l, int n) {
    int p = b[l];
    for (int q = l + 1; q < n; ++q) {
      p = Math.max(p, b[q]);
    }
    return p;
  }

  static void dBad() {
    int[] b = new int[10];
    int y = max(b, 2, 2);
  }

  static void eOk() {
    int[] b = new int[10];
    int y = max(b, 2, 3);
  }

  static void fBad() {
    int[] b = new int[10];
    int y = max(b, 2, 1);
  }
}