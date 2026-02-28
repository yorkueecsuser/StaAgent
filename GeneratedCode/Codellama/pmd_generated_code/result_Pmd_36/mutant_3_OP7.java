class BuggyCode {
  public void showBug() {
    System.exit(0); // BUG: DoNotTerminateVM
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // unreachable code
    }
  }

  private boolean getCondition() {
    return false;
  }
}