class SwitchFallthroughDeadStoreFalsePositive {
  public int f(int x) {
    int result1 = 0;
    int result2 = 0;
    boolean condition = getCondition();
    switch (x) {
      case 0:
        result1 = 1;
        if (condition) { // Unreachable if statement
          result1 = 99; // Unique mutation
        }
      case 1:
        result2 = 2;
        break;
    }
    return result1 + result2;
  }

  public int g(int x) {
    int result1 = 0;
    int result2 = 0;
    boolean condition = getCondition();
    switch (x) {
      case 0:
        result1 = 1;
      case 1:
        result2 = 1;
        result2 = 2;
        if (condition) { // Unreachable if statement
          result2 = 88; // Unique mutation
        }
        break;
    }
    return result1 + result2;
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined but always false
  }
}