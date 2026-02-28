class CompareArgs {
  static int max(int[] a, int i, int k) {
    int m = a[i];
    int j = i + 1;
    do {
      m = Math.max(m, a[j]);
      j++;
    } while (j < k);
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
}