class Issue1498 {
  int test00(int i) {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Unreachable code
      i = i + 1;
    } else {
      // Unreachable code
      i = i - 1;
    }
    return i % 60 * 1000;
  }

  int test01(int i) {
    int n = i % 60 * 1000;
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Unreachable code
      n = n + 1;
    } else {
      // Unreachable code
      n = n - 1;
    }
    return n;
  }

  int[] test02(int i) {
    int[] ns = new int[2];
    for (int j = 0; j < 2; j++) {
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // Unreachable code
        ns[j] = ns[j] + 1;
      } else {
        // Unreachable code
        ns[j] = ns[j] - 1;
      }
      ns[j] = i % 60 * 1000;
    }
    return ns;
  }

  private boolean getCondition() {
    return false; // This method will always return false, making the if-else branches unreachable
  }
}