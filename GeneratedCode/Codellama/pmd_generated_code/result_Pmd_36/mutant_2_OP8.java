class BuggyCode {
  public void showBug() {
    System.exit(0); // BUG: DoNotTerminateVM
  }

  public void showBugMutant() {
    System.exit(1); // BUG: DoNotTerminateVM - Mutant
  }
}