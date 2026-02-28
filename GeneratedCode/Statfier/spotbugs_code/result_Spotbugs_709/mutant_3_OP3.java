class BranchOrStatement {

  int f(Object x) {
    int result = 0;
    if (x == null) result = 1;
    // Unreachable if statement mutation
    boolean condition = getCondition();
    if (condition) result = 2; // This branch is unreachable because getCondition() will never return true
    result += x.hashCode();
    return result;
  }

  int f2(Object x) {
    int result = 0;
    if (x!= null) result = 1;
    // Unreachable if statement mutation
    boolean condition = getCondition();
    if (condition) result = 2; // This branch is unreachable because getCondition() will never return true
    result += x.hashCode();
    return result;
  }

  int f3(Object x) {
    int result;
    if (x == null) result = x.hashCode();
    else result = x.hashCode();
    // Unreachable if statement mutation
    boolean condition = getCondition();
    if (condition) result = 2; // This branch is unreachable because getCondition() will never return true
    return result;
  }

  // Method to provide a condition that is always false
  private boolean getCondition() {
    return false;
  }
}