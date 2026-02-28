class Ideas_2013_04_29 {

  public int testSelfOperation(int x) {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
      x = x + 1;
    }

    int y = x;
    y = y - x;
    return y;
  }

  int a, b;

  public int testSelfOperationField(int x) {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
      a = a + 1;
    }

    a = x;
    b = a;
    b = b - a;
    return b;
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined but always returns false
  }
}