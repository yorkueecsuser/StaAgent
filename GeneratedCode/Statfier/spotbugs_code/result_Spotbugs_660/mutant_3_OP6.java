class Ideas_2013_04_29 {

  public int testSelfOperation(int x) {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { // Unreachable for loop
      // This loop is unreachable because conditionFor is dynamically determined and will be false
    }

    int y = x;
    y = y - x;
    return y;
  }

  int a, b;

  public int testSelfOperationField(int x) {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { // Unreachable for loop
      // This loop is unreachable because conditionFor is dynamically determined and will be false
    }

    a = x;
    b = a;
    b = b - a;
    return b;
  }

  private boolean getCondition() {
    return false; // This method returns false, making the for loop unreachable
  }
}