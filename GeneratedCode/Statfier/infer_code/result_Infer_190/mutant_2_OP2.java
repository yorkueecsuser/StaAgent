class CompareArgs {
  static int max(int[] a, int i, int k) {
    int m = a[i];
    m = a[i]; // Mutant: Duplicate assignment statement
    for (int j = i + 1; j < k; ++j) {
      m = Math.max(m, a[j]);
      m = Math.max(m, a[j]); // Mutant: Duplicate assignment statement, but it uses method invocation, so we skip this one
    }
    return m;
  }

  static void aBad() {
    int[] a = new int[10];
    int x = max(a, 2, 2);
    int x1 = max(a, 2, 2); // Mutant: Duplicate assignment statement
  }

  static void bOk() {
    int[] a = new int[10];
    int x = max(a, 2, 3);
    int x1 = max(a, 2, 3); // Mutant: Duplicate assignment statement
  }

  static void cBad() {
    int[] a = new int[10];
    int x = max(a, 2, 1);
    int x1 = max(a, 2, 1); // Mutant: Duplicate assignment statement
  }
}