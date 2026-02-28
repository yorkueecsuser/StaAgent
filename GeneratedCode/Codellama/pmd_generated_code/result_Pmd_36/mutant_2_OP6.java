class BuggyCode {
  public void showBug() {
    System.exit(0); // BUG: DoNotTerminateVM
    for (int i = 0; false; i++) {
      // Unreachable code
    }
  }
}