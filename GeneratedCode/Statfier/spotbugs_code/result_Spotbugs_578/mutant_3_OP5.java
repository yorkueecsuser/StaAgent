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
    // Introduced unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case will never be reached because condition is always false
        y = "unreachable";
        break;
      case 1:
        // This case is always reached
        break;
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
    // Introduced unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case will never be reached because condition is always false
        y = "unreachable";
        break;
      case 1:
        // This case is always reached
        break;
    }
    if (x > 0) result += x;
    else result -= x;
    result += y.hashCode();
    return result;
  }

  private boolean getCondition() {
    // This method ensures the condition is dynamically determined at runtime
    return false;
  }
}