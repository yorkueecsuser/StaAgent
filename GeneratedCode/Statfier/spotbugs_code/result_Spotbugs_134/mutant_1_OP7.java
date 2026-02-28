class SwitchFallthroughDeadStoreFalsePositive {
  public int f(int x) {
    int result1 = 0;
    int result2 = 0;
    boolean conditionWhile = getCondition();
    while (conditionWhile) { // Unreachable while loop
      // This loop is unreachable because conditionWhile is dynamically determined and set to false at runtime
    }
    switch (x) {
      case 0:
        result1 = 1;
      case 1:
        result2 = 2;
        break;
    }
    return result1 + result2;
  }

  public int g(int x) {
    int result1 = 0;
    int result2 = 0;
    boolean conditionWhile = getCondition();
    while (conditionWhile) { // Unreachable while loop
      // This loop is unreachable because conditionWhile is dynamically determined and set to false at runtime
    }
    switch (x) {
      case 0:
        result1 = 1;
      case 1:
        result2 = 1;
        result2 = 2;
        break;
    }
    return result1 + result2;
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined at runtime
  }
}