class BuggyCode {
  public void showBug() {
    String deadStore = "abcdefg"; // Dead Store
    System.exit(0); // BUG: DoNotTerminateVM
  }
}