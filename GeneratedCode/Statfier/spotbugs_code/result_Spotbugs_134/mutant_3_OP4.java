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
    // Mutant: Adding an unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      result1 = 99; // This line will never be executed
    } else {
      result2 = 99; // This line will never be executed either
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
    // Mutant: Adding an unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      result1 = 88; // This line will never be executed
    } else {
      result2 = 88; // This line will never be executed either
    }
    return result1 + result2;
  }

  // Method to simulate a dynamic condition
  private boolean getCondition() {
    return false; // This method always returns false, making the if-else branches unreachable
  }
}