class DuplicateBranches {
  public int doit(boolean b, int i, int j) {
    int z;
    if (b) {
      int k = i * j;
      z = k / 100;
      boolean conditionFor = getCondition();
      for (int x = 0; conditionFor; x++) { // Unreachable for loop
        // This loop is unreachable because conditionFor is never set to true
      }
    } else {
      int k = i * j;
      z = k / 100;
    }
    return z;
  }

  public int doit2(int i, int j) {
    switch (i) {
      case 0:
        j = j + 1;
        if (i < j) j = i;
        boolean conditionFor = getCondition();
        for (int x = 0; conditionFor; x++) { // Unreachable for loop
          // This loop is unreachable because conditionFor is never set to true
        }
        break;

      case 1:
        j = j + 1;
        if (i < j) j = i;
        boolean conditionFor1 = getCondition();
        for (int x = 0; conditionFor1; x++) { // Unreachable for loop
          // This loop is unreachable because conditionFor1 is never set to true
        }
        break;

      case 2:
        j = j + 1;
        if (i < j) j = i;
        boolean conditionFor2 = getCondition();
        for (int x = 0; conditionFor2; x++) { // Unreachable for loop
          // This loop is unreachable because conditionFor2 is never set to true
        }
        break;

      default:
        j = j + 1;
        if (i < j) j = i;
        boolean conditionFor3 = getCondition();
        for (int x = 0; conditionFor3; x++) { // Unreachable for loop
          // This loop is unreachable because conditionFor3 is never set to true
        }
        break;
    }
    return j;
  }

  public int doit3(int i, int j) {
    switch (i) {
      case 1:
        j = i + 1;
        boolean conditionFor = getCondition();
        for (int x = 0; conditionFor; x++) { // Unreachable for loop
          // This loop is unreachable because conditionFor is never set to true
        }
        break;

      case 10:
        j = i + 1;
        boolean conditionFor1 = getCondition();
        for (int x = 0; conditionFor1; x++) { // Unreachable for loop
          // This loop is unreachable because conditionFor1 is never set to true
        }
        break;

      case 100:
        j = i + 1;
        boolean conditionFor2 = getCondition();
        for (int x = 0; conditionFor2; x++) { // Unreachable for loop
          // This loop is unreachable because conditionFor2 is never set to true
        }
        break;

      default:
        j = i + 1;
        boolean conditionFor3 = getCondition();
        for (int x = 0; conditionFor3; x++) { // Unreachable for loop
          // This loop is unreachable because conditionFor3 is never set to true
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
    boolean conditionFor = getCondition();
    for (int x = 0; conditionFor; x++) { // Unreachable for loop
      // This loop is unreachable because conditionFor is never set to true
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
        return null;
    }
    boolean conditionFor = getCondition();
    for (int x = 0; conditionFor; x++) { // Unreachable for loop
      // This loop is unreachable because conditionFor is never set to true
    }
  }

  private boolean getCondition() {
    return false; // This method returns false, ensuring the loop is unreachable
  }
}