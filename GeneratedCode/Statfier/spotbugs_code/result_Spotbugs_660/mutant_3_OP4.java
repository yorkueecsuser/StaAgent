class Ideas_2013_04_29 {

  public int testSelfOperation(int x) {
    boolean condition = getCondition();
    if (condition) {
      // Some unreachable code
      int unreachableVar = 10;
      unreachableVar++;
    } else {
      // Another unreachable code
      int anotherUnreachableVar = 20;
      anotherUnreachableVar--;
    }

    int y = x;
    y = y - x;
    return y;
  }

  int a, b;

  public int testSelfOperationField(int x) {
    boolean condition = getCondition();
    if (condition) {
      // Some unreachable code
      int unreachableVar = 10;
      unreachableVar++;
    } else {
      // Another unreachable code
      int anotherUnreachableVar = 20;
      anotherUnreachableVar--;
    }

    a = x;
    b = a;
    b = b - a;
    return b;
  }

  private boolean getCondition() {
    // This method should return a condition that is dynamically determined at runtime
    return false; // In a real scenario, this should be a dynamic condition
  }
}