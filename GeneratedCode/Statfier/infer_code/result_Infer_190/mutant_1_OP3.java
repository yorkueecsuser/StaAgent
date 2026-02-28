class CompareArgs {
  static int max(int[] a, int i, int k) {
    int m = a[i];
    for (int j = i + 1; j < k; ++j) {
      m = Math.max(m, a[j]);
    }
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      m = -1;
    }
    return m;
  }

  static void aBad() {
    int[] a = new int[10];
    int x = max(a, 2, 2);
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      x = -1;
    }
  }

  static void bOk() {
    int[] a = new int[10];
    int x = max(a, 2, 3);
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      x = -1;
    }
  }

  static void cBad() {
    int[] a = new int[10];
    int x = max(a, 2, 1);
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      x = -1;
    }
  }

  static boolean getCondition() {
    return false;
  }
}