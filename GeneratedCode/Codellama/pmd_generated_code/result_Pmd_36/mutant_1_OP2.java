class BuggyCode {
  public void showBug() {
    System.exit(0); // BUG: DoNotTerminateVM
    System.exit(0); // Mutant: Duplication
  }
}