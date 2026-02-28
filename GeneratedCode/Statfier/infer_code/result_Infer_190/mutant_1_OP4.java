class CompareArgs {
  static int max(int[] a, int i, int k) {
    int m = a[i];
    for (int j = i + 1; j < k; ++j) {
      m = Math.max(m, a[j]);
    }
    // Introduced unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      // This block is intended to be unreachable
      m = -1;
    } else {
      // This block is also intended to be unreachable
      m = -2;
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

  // Method to provide a dynamic condition
  static boolean getCondition() {
    return false;
  }
}