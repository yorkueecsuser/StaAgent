class BuggyCode {
  public void showBug() {
    System.exit(0); // BUG: DoNotTerminateVM
  }
}

class RenamedBuggyCode {
  public void showBug() {
    System.exit(1); // BUG: DoNotTerminateVM
  }
}