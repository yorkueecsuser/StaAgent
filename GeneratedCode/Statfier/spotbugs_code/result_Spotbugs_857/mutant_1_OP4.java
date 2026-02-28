class DuplicateBranches {
  public int doit(boolean b, int i, int j) {
    int z;
    if (b) {
      int k = i * j;
      z = k / 100;
    } else {
      int k = i * j;
      z = k / 100;
    }
    // Mutant: Adding an unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      z = z + 1; // This will never execute
    } else {
      z = z - 1; // This will also never execute
    }
    return z;
  }

  public int doit2(int i, int j) {
    switch (i) {
      case 0:
        j = j + 1;
        if (i < j) j = i;
        break;

      case 1:
        j = j + 1;
        if (i < j) j = i;
        break;

      case 2:
        j = j + 1;
        if (i < j) j = i;
        break;

      default:
        j = j + 1;
        if (i < j) j = i;
        break;
    }
    // Mutant: Adding an unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      j = j * 2; // This will never execute
    } else {
      j = j / 2; // This will also never execute
    }
    return j;
  }

  public int doit3(int i, int j) {
    switch (i) {
      case 1:
        j = i + 1;
        break;

      case 10:
        j = i + 1;
        break;

      case 100:
        j = i + 1;
        break;

      default:
        j = i + 1;
        break;
    }
    // Mutant: Adding an unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      j = j + 10; // This will never execute
    } else {
      j = j - 10; // This will also never execute
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
    // Mutant: Adding an unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      return 3; // This will never execute
    } else {
      return 4; // This will also never execute
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
    // Mutant: Adding an unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      return "3"; // This will never execute
    } else {
      return "4"; // This will also never execute
    }
  }

  // Helper method to provide a dynamic condition
  private boolean getCondition() {
    return false; // This method can be modified to return true/false dynamically at runtime
  }
}