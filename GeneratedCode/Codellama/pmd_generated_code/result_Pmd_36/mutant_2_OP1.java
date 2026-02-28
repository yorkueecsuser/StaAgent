class BuggyCode {
  public void showBug() {
    String randomString = "abcdefg"; // Dead Store
    System.exit(0); // BUG: DoNotTerminateVM
  }
}