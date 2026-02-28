class DuplicateBranches {
  public int doit(boolean b, int i, int j) {
    int z;
    if (b) {
      int k = i * j;
      z = k / 100;
      boolean conditionWhile = getCondition();
      while (conditionWhile) {
        // Unreachable while loop
      }
    } else {
      int k = i * j;
      z = k / 100;
      boolean conditionWhile = getCondition();
      while (conditionWhile) {
        // Unreachable while loop
      }
    }
    return z;
  }

  public int doit2(int i, int j) {
    switch (i) {
      case 0:
        j = j + 1;
        if (i < j) j = i;
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
          // Unreachable while loop
        }
        break;

      case 1:
        j = j + 1;
        if (i < j) j = i;
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
          // Unreachable while loop
        }
        break;

      case 2:
        j = j + 1;
        if (i < j) j = i;
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
          // Unreachable while loop
        }
        break;

      default:
        j = j + 1;
        if (i < j) j = i;
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
          // Unreachable while loop
        }
        break;
    }
    return j;
  }

  public int doit3(int i, int j) {
    switch (i) {
      case 1:
        j = i + 1;
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
          // Unreachable while loop
        }
        break;

      case 10:
        j = i + 1;
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
          // Unreachable while loop
        }
        break;

      case 100:
        j = i + 1;
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
          // Unreachable while loop
        }
        break;

      default:
        j = i + 1;
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
          // Unreachable while loop
        }
        break;
    }
    return j;
  }

  /** false positive?? bug1481642 */
  public int g_korland(int a) {
    // int a = 1;
    switch (a) {
      case 1:
        return 1;
      case 2:
        return 2;
    }
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
    }
    return -1;
  }

  /** false positive?? bug1508906 */
  public String peeterswim(int index) {
    switch (index) {
      case 0:
        return "0";
      case 1:
        return "1";
      case 2:
        return "2";
      default:
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
          // Unreachable while loop
        }
        return null;
    }
  }

  private boolean getCondition() {
    return false;
  }
}