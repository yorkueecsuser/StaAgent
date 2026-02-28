class SwitchFallthroughDeadStoreFalsePositive {
  public int f(int x) {
    int result1 = 0;
    int result2 = 0;
    switch (x) {
      case 0:
        result1 = 1;
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
          // Unreachable for loop
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
        for (int i = 0; conditionFor; i++) {
          // Unreachable for loop
        }
        break;
    }
    return result1 + result2;
  }

  private boolean getCondition() {
    return false;
  }
}