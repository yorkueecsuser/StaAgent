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
    return result1 + result2;
  }

  // Mutant of f method with renamed variable
  public int fa(int x) {
    int a = 0;
    int b = 0;
    switch (x) {
      case 0:
        a = 1;
      case 1:
        b = 2;
        break;
    }
    return a + b;
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
    return result1 + result2;
  }

  // Mutant of g method with renamed variable
  public int ga(int x) {
    int a = 0;
    int b = 0;
    switch (x) {
      case 0:
        a = 1;
      case 1:
        b = 1;
        b = 2;
        break;
    }
    return a + b;
  }
}