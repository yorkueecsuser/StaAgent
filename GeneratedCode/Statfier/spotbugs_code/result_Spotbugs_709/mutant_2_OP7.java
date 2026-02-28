class BranchOrStatement {

  int f(Object x) {
    int result = 0;
    if (x == null) result = 1;
    result += x.hashCode();
    
    // Unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable
    }
    
    return result;
  }

  int f2(Object x) {
    int result = 0;
    if (x!= null) result = 1;
    result += x.hashCode();
    
    // Unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable
    }
    
    return result;
  }

  int f3(Object x) {
    int result;
    if (x == null) result = x.hashCode();
    else result = x.hashCode();
    
    // Unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable
    }
    
    return result;
  }

  // Method to provide a dynamic condition that is always false
  private boolean getCondition() {
    return false;
  }
}