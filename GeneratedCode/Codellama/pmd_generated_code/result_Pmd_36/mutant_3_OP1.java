class BuggyCode {
  public void showBug() {
    System.exit(0); // BUG: DoNotTerminateVM
    int fdghjkl = 0; // Dead Store
  }
}