class BuggyCode {
  public void showBug() {
    System.exit(0); // BUG: DoNotTerminateVM
    int a = 1;
    a = 1;
  }
}