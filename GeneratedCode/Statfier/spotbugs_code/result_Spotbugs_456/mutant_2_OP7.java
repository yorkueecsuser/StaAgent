class Issue1498 {
  int test00(int i) {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
    return i % 60 * 1000;
  }

  int test01(int i) {
    int n = i % 60 * 1000;
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
    return n;
  }

  int[] test02(int i) {
    int[] ns = new int[2];
    for (int j = 0; j < 2; j++) {
      ns[j] = i % 60 * 1000;
    }
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
    return ns;
  }

  private boolean getCondition() {
    return false;
  }
}