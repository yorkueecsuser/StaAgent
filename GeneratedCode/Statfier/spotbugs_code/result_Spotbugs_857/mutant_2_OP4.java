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
    // Inserting an unreachable if-else branch
    boolean unreachableCondition = getUnreachableCondition();
    if (unreachableCondition) {
      z = i + j; // This branch is unreachable
    } else {
      z = i - j; // This branch is also unreachable
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
    // Inserting an unreachable if-else branch
    boolean unreachableCondition = getUnreachableCondition();
    if (unreachableCondition) {
      j = i * j; // This branch is unreachable
    } else {
      j = i / j; // This branch is also unreachable
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
    // Inserting an unreachable if-else branch
    boolean unreachableCondition = getUnreachableCondition();
    if (unreachableCondition) {
      j = i - 1; // This branch is unreachable
    } else {
      j = i + 1; // This branch is also unreachable
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
    // Inserting an unreachable if-else branch
    boolean unreachableCondition = getUnreachableCondition();
    if (unreachableCondition) {
      return a + 1; // This branch is unreachable
    } else {
      return a - 1; // This branch is also unreachable
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
    // Inserting an unreachable if-else branch
    boolean unreachableCondition = getUnreachableCondition();
    if (unreachableCondition) {
      return "unreachable"; // This branch is unreachable
    } else {
      return "also unreachable"; // This branch is also unreachable
    }
  }

  // Method to provide a dynamic condition for unreachable branches
  private boolean getUnreachableCondition() {
    return false; // This method will always return false, ensuring the branches are unreachable
  }
}