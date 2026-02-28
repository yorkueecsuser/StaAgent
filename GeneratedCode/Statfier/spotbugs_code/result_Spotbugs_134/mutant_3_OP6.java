class SwitchFallthroughDeadStoreFalsePositive {
  public int f(int x) {
    int result1 = 0;
    int result2 = 0;
    switch (x) {
      case 0:
        result1 = 1;
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) { // Unreachable for loop
          result1 += i; // This loop will never execute
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
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) { // Unreachable for loop
          result2 += i; // This loop will never execute
        }
        break;
    }
    return result1 + result2;
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined but returns false
  }
}