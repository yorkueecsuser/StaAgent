class BuggyCode {
  public void showBug() {
    boolean condition = getCondition(); // Added non-final variable to make if branch unreachable
    if (condition) { // Added unreachable if branch
      System.exit(0); // BUG: DoNotTerminateVM
    }
  }
}