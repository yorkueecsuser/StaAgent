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

  // Mutated code starts here
  static int max(int[] b, int l, int n) {
    int q = b[l];
    for (int p = l + 1; p < n; ++p) {
      q = Math.max(q, b[p]);
    }
    return q;
  }

  static void dBad() {
    int[] c = new int[10];
    int y = max(c, 2, 2);
  }

  static void eOk() {
    int[] c = new int[10];
    int y = max(c, 2, 3);
  }

  static void fBad() {
    int[] c = new int[10];
    int y = max(c, 2, 1);
  }
}