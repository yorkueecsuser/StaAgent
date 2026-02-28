class BranchOrStatement {

  int f(Object x) {
    int result = 0;
    if (x == null) result = 1;
    result += x.hashCode();
    
    // Mutant: Unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      result = 999; // This branch is unreachable because getCondition() will never return true
    } else {
      result = 888; // This branch is also unreachable for the same reason
    }
    
    return result;
  }

  int f2(Object x) {
    int result = 0;
    if (x!= null) result = 1;
    result += x.hashCode();
    
    // Mutant: Unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      result = 777; // This branch is unreachable because getCondition() will never return true
    } else {
      result = 666; // This branch is also unreachable for the same reason
    }
    
    return result;
  }

  int f3(Object x) {
    int result;
    if (x == null) result = x.hashCode();
    else result = x.hashCode();
    
    // Mutant: Unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      result = 555; // This branch is unreachable because getCondition() will never return true
    } else {
      result = 444; // This branch is also unreachable for the same reason
    }
    
    return result;
  }

  // Method to provide a dynamic condition that will never be true
  private boolean getCondition() {
    return false;
  }
}