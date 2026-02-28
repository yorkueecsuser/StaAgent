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
    // Inserting an unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        result1 = 99; // This will never be reached
        break;
      case 1:
        result2 = 99; // This will never be reached
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
    // Inserting an unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        result1 = 99; // This will never be reached
        break;
      case 1:
        result2 = 99; // This will never be reached
        break;
    }
    return result1 + result2;
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined at runtime
  }
}