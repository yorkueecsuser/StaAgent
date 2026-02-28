class BranchOrStatement {

  int f(Object x) {
    int result = 0;
    if (x == null) result = 1;
    result += x.hashCode();
    // Mutant: Inserting an unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      result = 2; // This will never be executed because shouldRun is always false
    } else {
      result = 3; // This will also never be executed because shouldRun is always false
    }
    return result;
  }

  int f2(Object x) {
    int result = 0;
    if (x!= null) result = 1;
    result += x.hashCode();
    // Mutant: Inserting an unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      result = 4; // This will never be executed because shouldRun is always false
    } else {
      result = 5; // This will also never be executed because shouldRun is always false
    }
    return result;
  }

  int f3(Object x) {
    int result;
    if (x == null) result = x.hashCode();
    else result = x.hashCode();
    // Mutant: Inserting an unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      result = 6; // This will never be executed because shouldRun is always false
    } else {
      result = 7; // This will also never be executed because shouldRun is always false
    }
    return result;
  }

  // Method to provide a dynamic condition that is always false
  private boolean getCondition() {
    return false;
  }
}