class BuggyCode {
  public void showBug() {
    System.exit(0); // BUG: DoNotTerminateVM
  }

  public void unreachableWhileLoop() {
    boolean cond = false;
    while (cond) {
      // unreachable code
    }
  }
}