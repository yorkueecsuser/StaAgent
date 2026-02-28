class Issue1498 {
  int test00(int i) {
    boolean conditionFor = getCondition();
    for (int k = 0; conditionFor; k++) {
      // Unreachable loop
    }
    return i % 60 * 1000;
  }

  int test01(int i) {
    int n = i % 60 * 1000;
    boolean conditionFor = getCondition();
    for (int k = 0; conditionFor; k++) {
      // Unreachable loop
    }
    return n;
  }

  int[] test02(int i) {
    int[] ns = new int[2];
    for (int j = 0; j < 2; j++) {
      ns[j] = i % 60 * 1000;
    }
    boolean conditionFor = getCondition();
    for (int k = 0; conditionFor; k++) {
      // Unreachable loop
    }
    return ns;
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined but returns false
  }
}