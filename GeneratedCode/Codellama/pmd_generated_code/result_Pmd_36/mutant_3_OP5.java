class BuggyCode {
  public void showBug() {
    System.exit(0); // BUG: DoNotTerminateVM
    switch (0) { // Unreachable switch statement mutant
      case 1:
        // code
        break;
      default:
        // code
        break;
    }
  }
}