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

  // Mutated code for method f
  public int f_mutated(int x) {
    int a = 0; // Renamed result1 to a
    int b = 0; // Renamed result2 to b
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

  // Mutated code for method g
  public int g_mutated(int x) {
    int c = 0; // Renamed result1 to c
    int d = 0; // Renamed result2 to d
    switch (x) {
      case 0:
        c = 1;
      case 1:
        d = 1;
        d = 2;
        break;
    }
    return c + d;
  }
}