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
    if (x > 0) result += x;
    else result -= x;
    
    // Introduced unreachable switch statement
    boolean condition = getUnreachableCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is always false
        y = "unreachable";
        break;
      case 1:
        // This case is always executed
        break;
    }
    
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
    if (x > 0) result += x;
    else result -= x;
    
    // Introduced unreachable switch statement
    boolean condition = getUnreachableCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is always false
        y = "unreachable";
        break;
      case 1:
        // This case is always executed
        break;
    }
    
    result += y.hashCode();
    return result;
  }

  private boolean getUnreachableCondition() {
    return false;
  }
}