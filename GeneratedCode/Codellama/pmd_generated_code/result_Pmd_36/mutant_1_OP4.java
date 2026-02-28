class BuggyCode {
  public void showBug() {
    System.exit(0); // BUG: DoNotTerminateVM
    if (false) {
      System.out.println("Unreachable code");
    } else {
      System.out.println("Reachable code");
    }
  }
}