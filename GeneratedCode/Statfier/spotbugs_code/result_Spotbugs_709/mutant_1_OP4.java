class BranchOrStatement {

  int f(Object x) {
    int result = 0;
    if (x == null) result = 1;
    result += x.hashCode();
    // Mutant: Inserting unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      result = 2; // This branch is unreachable if getCondition() always returns false
    } else {
      result = 3; // This branch is also unreachable if getCondition() always returns false
    }
    return result;
  }

  int f2(Object x) {
    int result = 0;
    if (x!= null) result = 1;
    result += x.hashCode();
    // Mutant: Inserting unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      result = 4; // This branch is unreachable if getCondition() always returns false
    } else {
      result = 5; // This branch is also unreachable if getCondition() always returns false
    }
    return result;
  }

  int f3(Object x) {
    int result;
    if (x == null) result = x.hashCode();
    else result = x.hashCode();
    // Mutant: Inserting unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      result = 6; // This branch is unreachable if getCondition() always returns false
    } else {
      result = 7; // This branch is also unreachable if getCondition() always returns false
    }
    return result;
  }

  // Helper method to simulate dynamic condition
  private boolean getCondition() {
    return false; // This ensures the branches are unreachable
  }
}