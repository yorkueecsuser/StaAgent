class CompareArgs {
  static int max(int[] a, int i, int k) {
    int m = a[i];
    for (int j = i + 1; j < k; ++j) {
      m = Math.max(m, a[j]);
    }
    // Inserting an unreachable for loop
    boolean conditionFor = getCondition();
    for (int j = 0; conditionFor; j++) {
      // This loop is unreachable because conditionFor will always be false
    }
    return m;
  }

  static void aBad() {
    int[] a = new int[10];
    int x = max(a, 2, 2);
    // Inserting an unreachable for loop
    boolean conditionFor = getCondition();
    for (int j = 0; conditionFor; j++) {
      // This loop is unreachable because conditionFor will always be false
    }
  }

  static void bOk() {
    int[] a = new int[10];
    int x = max(a, 2, 3);
    // Inserting an unreachable for loop
    boolean conditionFor = getCondition();
    for (int j = 0; conditionFor; j++) {
      // This loop is unreachable because conditionFor will always be false
    }
  }

  static void cBad() {
    int[] a = new int[10];
    int x = max(a, 2, 1);
    // Inserting an unreachable for loop
    boolean conditionFor = getCondition();
    for (int j = 0; conditionFor; j++) {
      // This loop is unreachable because conditionFor will always be false
    }
  }

  // Method to provide a dynamic condition that will always be false
  private static boolean getCondition() {
    return false;
  }
}