class BuggyCode {
  public void showBug() {
    System.exit(0); // BUG: DoNotTerminateVM
  }

  // Renamed variable "x" to "a"
  int a = 1;
}