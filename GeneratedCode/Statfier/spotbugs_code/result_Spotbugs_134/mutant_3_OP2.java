class SwitchFallthroughDeadStoreFalsePositive {
  public int f(int x) {
    int result1 = 0;
    int result2 = 0;
    switch (x) {
      case 0:
        result1 = 1;
        result1 = 1; // Mutant: Duplicate assignment
      case 1:
        result2 = 2;
        result2 = 2; // Mutant: Duplicate assignment
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
        result1 = 1; // Mutant: Duplicate assignment
      case 1:
        result2 = 1;
        result2 = 1; // Mutant: Duplicate assignment
        result2 = 2;
        result2 = 2; // Mutant: Duplicate assignment
        break;
    }
    return result1 + result2;
  }
}