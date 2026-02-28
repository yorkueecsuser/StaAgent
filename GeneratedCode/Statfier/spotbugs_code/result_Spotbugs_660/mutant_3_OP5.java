class Ideas_2013_04_29 {

  public int testSelfOperation(int x) {

    int y = x;
    y = y - x;

    // Introduced unreachable switch statement
    boolean condition = getCondition();
    switch(condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is always false
        y = y + 1;
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
    boolean conditionField = getConditionField();
    switch(conditionField? 0 : 1) {
      case 0:
        // This case is unreachable because conditionField is always false
        b = b + 1;
        break;
    }

    return b;
  }

  // Method to provide dynamic condition
  private boolean getCondition() {
    return false;
  }

  // Another method to provide dynamic condition
  private boolean getConditionField() {
    return false;
  }
}