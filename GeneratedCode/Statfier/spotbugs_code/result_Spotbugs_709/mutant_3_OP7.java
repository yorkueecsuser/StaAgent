class BranchOrStatement {

  int f(Object x) {
    int result = 0;
    boolean conditionWhile = getCondition();
    while (conditionWhile) { // Unreachable while loop
      result = 1;
    }
    if (x == null) result = 1;
    result += x.hashCode();
    return result;
  }

  int f2(Object x) {
    int result = 0;
    boolean conditionWhile = getCondition();
    while (conditionWhile) { // Unreachable while loop
      result = 1;
    }
    if (x!= null) result = 1;
    result += x.hashCode();
    return result;
  }

  int f3(Object x) {
    int result;
    boolean conditionWhile = getCondition();
    while (conditionWhile) { // Unreachable while loop
      result = 1;
    }
    if (x == null) result = x.hashCode();
    else result = x.hashCode();
    return result;
  }

  private boolean getCondition() {
    return false; // This method will always return false, ensuring the while loop is unreachable
  }
}