class Issue1498 {
  int test00(int i) {
    return i % 60 * 1000;
  }

  int test01(int i) {
    int n = i % 60 * 1000;
    // Introduced unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is always false
        n = 0;
        break;
    }
    return n;
  }

  int[] test02(int i) {
    int[] ns = new int[2];
    for (int j = 0; j < 2; j++) {
      ns[j] = i % 60 * 1000;
      // Introduced unreachable switch statement
      boolean condition = getCondition();
      switch (condition? 0 : 1) {
        case 0:
          // This case is unreachable because condition is always false
          ns[j] = 0;
          break;
      }
    }
    return ns;
  }

  // Helper method to provide a dynamic condition
  private boolean getCondition() {
    return false;
  }
}