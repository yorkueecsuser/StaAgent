class CompareArgs {
  static int max(int[] a, int i, int k) {
    int m = a[i];
    for (int j = i + 1; j < k; ++j) {
      m = Math.max(m, a[j]);
    }
    // Inserting an unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
      m = m + 1;
    }
    return m;
  }

  static void aBad() {
    int[] a = new int[10];
    int x = max(a, 2, 2);
    // Inserting an unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
      x = x + 1;
    }
  }

  static void bOk() {
    int[] a = new int[10];
    int x = max(a, 2, 3);
    // Inserting an unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
      x = x - 1;
    }
  }

  static void cBad() {
    int[] a = new int[10];
    int x = max(a, 2, 1);
    // Inserting an unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
      x = x * 2;
    }
  }

  // Method to provide a dynamic condition
  static boolean getCondition() {
    return false;
  }
}