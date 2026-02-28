class Issue1498 {
  int test00(int i) {
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is never reached because condition is always false
        i = i + 1; // Some dummy operation to avoid empty case block
        break;
    }
    return i % 60 * 1000;
  }

  int test01(int i) {
    int n = i % 60 * 1000;
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is never reached because condition is always false
        n = n + 1; // Some dummy operation to avoid empty case block
        break;
    }
    return n;
  }

  int[] test02(int i) {
    int[] ns = new int[2];
    for (int j = 0; j < 2; j++) {
      boolean condition = getCondition();
      switch (condition? 0 : 1) {
        case 0:
          // This case is never reached because condition is always false
          ns[j] = ns[j] + 1; // Some dummy operation to avoid empty case block
          break;
      }
      ns[j] = i % 60 * 1000;
    }
    return ns;
  }

  private boolean getCondition() {
    // This method always returns false, making the switch statement unreachable
    return false;
  }
}