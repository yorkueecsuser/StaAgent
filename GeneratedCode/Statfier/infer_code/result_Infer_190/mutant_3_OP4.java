class CompareArgs {
  static int max(int[] a, int i, int k) {
    int m = a[i];
    for (int j = i + 1; j < k; ++j) {
      m = Math.max(m, a[j]);
    }
    // Inserting an unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block is reachable
      m = m + 1;
    } else {
      // This block is unreachable
      m = m - 1;
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
  private static boolean getCondition() {
    return true; // This ensures the if block is reachable and else is unreachable
  }
}