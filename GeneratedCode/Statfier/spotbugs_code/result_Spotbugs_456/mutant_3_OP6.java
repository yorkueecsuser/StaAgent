class Issue1498 {
  int test00(int i) {
    // Inserting an unreachable for loop
    boolean conditionFor = getCondition();
    for (int j = 0; conditionFor; j++) {
      // This loop is unreachable because conditionFor is dynamically determined and expected to be false
    }
    return i % 60 * 1000;
  }

  int test01(int i) {
    int n = i % 60 * 1000;
    // Inserting an unreachable for loop
    boolean conditionFor = getCondition();
    for (int j = 0; conditionFor; j++) {
      // This loop is unreachable because conditionFor is dynamically determined and expected to be false
    }
    return n;
  }

  int[] test02(int i) {
    int[] ns = new int[2];
    for (int j = 0; j < 2; j++) {
      ns[j] = i % 60 * 1000;
    }
    // Inserting an unreachable for loop
    boolean conditionFor = getCondition();
    for (int j = 0; conditionFor; j++) {
      // This loop is unreachable because conditionFor is dynamically determined and expected to be false
    }
    return ns;
  }

  // Method to provide a dynamic condition that is expected to be false
  private boolean getCondition() {
    return false;
  }
}