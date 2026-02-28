class BranchOrStatement {

  int f(Object x) {
    int result = 0;
    if (x == null) result = 1;
    result += x.hashCode();
    // Mutant: Adding an unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      result = -1; // This line is unreachable if getCondition() always returns false
    }
    return result;
  }

  int f2(Object x) {
    int result = 0;
    if (x!= null) result = 1;
    result += x.hashCode();
    // Mutant: Adding an unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      result = -2; // This line is unreachable if getCondition() always returns false
    }
    return result;
  }

  int f3(Object x) {
    int result;
    if (x == null) result = x.hashCode();
    else result = x.hashCode();
    return result;
    // Mutant: Adding an unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      result = -3; // This line is unreachable if getCondition() always returns false
    }
  }

  // Method to provide a dynamic condition
  private boolean getCondition() {
    return false; // This method can be modified to return true in different scenarios to test the mutant
  }
}