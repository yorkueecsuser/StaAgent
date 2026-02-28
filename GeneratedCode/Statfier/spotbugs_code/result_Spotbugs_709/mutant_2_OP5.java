class BranchOrStatement {

  int f(Object x) {
    int result = 0;
    if (x == null) result = 1;
    result += x.hashCode();
    
    // Inserting unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case will never be executed because condition is always false
        result = -1;
        break;
    }
    
    return result;
  }

  int f2(Object x) {
    int result = 0;
    if (x!= null) result = 1;
    result += x.hashCode();
    
    // Inserting unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case will never be executed because condition is always false
        result = -1;
        break;
    }
    
    return result;
  }

  int f3(Object x) {
    int result;
    if (x == null) result = x.hashCode();
    else result = x.hashCode();
    
    // Inserting unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case will never be executed because condition is always false
        result = -1;
        break;
    }
    
    return result;
  }

  // Method to provide a dynamic condition that always evaluates to false
  private boolean getCondition() {
    return false;
  }
}