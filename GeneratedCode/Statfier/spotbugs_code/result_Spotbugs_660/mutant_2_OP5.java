class Ideas_2013_04_29 {

  public int testSelfOperation(int x) {

    int y = x;
    y = y - x;

    // Introduced unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case will never be reached because condition is always false
        y = y + 1;
        break;
      case 1:
        // This is the only reachable case
        break;
    }

    return y;
  }

  int a, b;

  public int testSelfOperationField(int x) {

    a = x;
    b = a;
    b = b - a;

    // Introduced unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case will never be reached because condition is always false
        b = b + 1;
        break;
      case 1:
        // This is the only reachable case
        break;
    }

    return b;
  }

  // Helper method to provide a dynamic condition
  private boolean getCondition() {
    return false;
  }
}