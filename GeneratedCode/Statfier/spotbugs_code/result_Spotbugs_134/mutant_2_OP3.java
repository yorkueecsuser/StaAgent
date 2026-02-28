class SwitchFallthroughDeadStoreFalsePositive {
  public int f(int x) {
    int result1 = 0;
    int result2 = 0;
    switch (x) {
      case 0:
        result1 = 1;
        boolean conditionF = getCondition();
        if (conditionF) { // Unreachable if statement
          result1 = 99; // Unique code
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
    switch (x) {
      case 0:
        result1 = 1;
      case 1:
        result2 = 1;
        result2 = 2;
        boolean conditionG = getCondition();
        if (conditionG) { // Unreachable if statement
          result2 = 88; // Unique code
        }
        break;
    }
    return result1 + result2;
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined at runtime
  }
}