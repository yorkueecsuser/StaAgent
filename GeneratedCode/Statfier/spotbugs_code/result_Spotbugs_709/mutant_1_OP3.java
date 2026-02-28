class BranchOrStatement {

  int f(Object x) {
    int result = 0;
    if (x == null) result = 1;
    // Mutant: Unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      result = 999; // This line is unreachable
    }
    result += x.hashCode();
    return result;
  }

  int f2(Object x) {
    int result = 0;
    if (x!= null) result = 1;
    // Mutant: Unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      result = 888; // This line is unreachable
    }
    result += x.hashCode();
    return result;
  }

  int f3(Object x) {
    int result;
    if (x == null) result = x.hashCode();
    else result = x.hashCode();
    // Mutant: Unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      result = 777; // This line is unreachable
    }
    return result;
  }

  // Method to provide a dynamic condition for the mutants
  private boolean getCondition() {
    return false; // This method always returns false, making the if statements unreachable
  }
}