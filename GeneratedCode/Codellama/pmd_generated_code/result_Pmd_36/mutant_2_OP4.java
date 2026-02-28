class BuggyCode {
  public void showBug() {
    System.exit(0); // BUG: DoNotTerminateVM
  }

  public void unreachableIfElse() {
    boolean condition = false;
    if (condition) {
      // unreachable code
      System.out.println("This code is unreachable");
    } else {
      System.out.println("This code is reachable");
    }
  }
}