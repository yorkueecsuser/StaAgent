class Issue1498 {
  int test00(int i) {
    // Inserting unreachable for loop
    boolean conditionFor = getCondition();
    for (int j = 0; conditionFor; j++) {
      // Unreachable code
      System.out.println("This loop is unreachable");
    }
    return i % 60 * 1000;
  }

  int test01(int i) {
    int n = i % 60 * 1000;
    // Inserting unreachable for loop
    boolean conditionFor = getCondition();
    for (int j = 0; conditionFor; j++) {
      // Unreachable code
      System.out.println("This loop is unreachable");
    }
    return n;
  }

  int[] test02(int i) {
    int[] ns = new int[2];
    for (int j = 0; j < 2; j++) {
      ns[j] = i % 60 * 1000;
    }
    // Inserting unreachable for loop
    boolean conditionFor = getCondition();
    for (int j = 0; conditionFor; j++) {
      // Unreachable code
      System.out.println("This loop is unreachable");
    }
    return ns;
  }

  // Method to provide a dynamic condition
  private boolean getCondition() {
    return false;
  }
}