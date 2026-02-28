class CompareArgs {
  static int max(int[] a, int i, int k) {
    int m = a[i];
    m = a[i]; // Mutant: duplicated assignment without method invocation
    for (int j = i + 1; j < k; ++j) {
      m = Math.max(m, a[j]);
    }
    return m;
  }

  static void aBad() {
    int[] a = new int[10];
    int x = max(a, 2, 2);
    x = max(a, 2, 2); // Mutant: duplicated assignment without method invocation
  }

  static void bOk() {
    int[] a = new int[10];
    int x = max(a, 2, 3);
    x = max(a, 2, 3); // Mutant: duplicated assignment without method invocation
  }

  static void cBad() {
    int[] a = new int[10];
    int x = max(a, 2, 1);
    x = max(a, 2, 1); // Mutant: duplicated assignment without method invocation
  }
}