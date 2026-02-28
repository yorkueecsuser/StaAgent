class SwitchFallthroughDeadStoreFalsePositive {
  public int f(int x) {
    int result1 = 0;
    int result2 = 0;
    switch (x) {
      case 0:
        result1 = 1;
      case 1:
        result2 = 2;
        break;
    }
    // Introduced unreachable switch statement
    boolean condition = getCondition();
    switch (getValue(condition)) {
      case 0:
        result1 = 3; // This will never be executed
        break;
      case 1:
        result2 = 4; // This will never be executed
        break;
    }
    return result1 + result2;
  }

  public int g(int x) {
    int result1 = 0;
    int result2 = 0;
    switch (x) {
      case 0:
        result1 = 1;
      case 1:
        result2 = 1;
        result2 = 2;
        break;
    }
    // Introduced unreachable switch statement
    boolean condition = getCondition();
    switch (getValue(condition)) {
      case 0:
        result1 = 3; // This will never be executed
        break;
      case 1:
        result2 = 4; // This will never be executed
        break;
    }
    return result1 + result2;
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined
  }

  private int getValue(boolean condition) {
    return condition? 0 : 1; // This method ensures the switch value is dynamically determined
  }
}