class CompareArgs {
  static int max(int[] a, int i, int k) {
    int m = a[i];
    for (int j = i + 1; j < k; ++j) {
      m = Math.max(m, a[j]);
    }
    // Inserting an unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 1 : 0) {
      case 2:
        m = -1; // This case is unreachable
        break;
    }
    return m;
  }

  static void aBad() {
    int[] a = new int[10];
    int x = max(a, 2, 2);
    // Inserting an unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 1 : 0) {
      case 2:
        x = -1; // This case is unreachable
        break;
    }
  }

  static void bOk() {
    int[] a = new int[10];
    int x = max(a, 2, 3);
    // Inserting an unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 1 : 0) {
      case 2:
        x = -1; // This case is unreachable
        break;
    }
  }

  static void cBad() {
    int[] a = new int[10];
    int x = max(a, 2, 1);
    // Inserting an unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 1 : 0) {
      case 2:
        x = -1; // This case is unreachable
        break;
    }
  }

  // Helper method to provide a dynamic condition
  private static boolean getCondition() {
    return false; // This will always return false, but it's not a compile-time constant
  }
}