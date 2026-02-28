class GuaranteedDereferenceLocationReporting {

  public int f(int x) {
    int result = 0;
    Object y = null;
    switch (x) {
      case 0:
        y = "0";
        break;
      case 1:
        // impossible
        break;
      case 2:
        y = "2";
        break;
      default:
        y = "unknown";
    }
    // Inserting unreachable if-else branch
    boolean condition = getCondition();
    if (condition) {
      // unreachable code
      y = "unreachable";
    } else {
      // alternative unreachable code
      y = "still unreachable";
    }
    if (x > 0) result += x;
    else result -= x;
    result += y.hashCode();
    return result;
  }

  public int f2(int x) {
    int result = 0;
    Object y = null;
    if (x == 0) y = "0";
    else if (x == 1) {
      // impossible
    } else if (x == 2) y = "2";
    else y = "unknown";
    // Inserting unreachable if-else branch
    boolean condition = getCondition();
    if (condition) {
      // unreachable code
      y = "unreachable";
    } else {
      // alternative unreachable code
      y = "still unreachable";
    }
    if (x > 0) result += x;
    else result -= x;
    result += y.hashCode();
    return result;
  }

  // Method to provide a dynamic condition for the unreachable branches
  private boolean getCondition() {
    return false; // This will always return false, but it's not a compile-time constant
  }
}