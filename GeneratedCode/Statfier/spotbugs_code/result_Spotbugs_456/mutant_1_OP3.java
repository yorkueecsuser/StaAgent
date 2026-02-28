class Issue1498 {
  int test00(int i) {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      i = i + 1;
    }
    return i % 60 * 1000;
  }

  int test01(int i) {
    int n = i % 60 * 1000;
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      n = n + 1;
    }
    return n;
  }

  int[] test02(int i) {
    int[] ns = new int[2];
    for (int j = 0; j < 2; j++) {
      boolean condition = getCondition();
      if (condition) {
        // Unreachable code
        ns[j] = ns[j] + 1;
      }
      ns[j] = i % 60 * 1000;
    }
    return ns;
  }

  private boolean getCondition() {
    // This method should return a condition that is dynamically determined at runtime
    // For demonstration purposes, it always returns false, but it can be more complex
    return false;
  }
}