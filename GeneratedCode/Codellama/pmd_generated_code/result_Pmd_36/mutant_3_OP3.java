class BuggyCode {
  public void showBug() {
    boolean unreachableCondition = false;
    if (unreachableCondition) {
      System.out.println("This branch is unreachable");
    }
    System.exit(0); // BUG: DoNotTerminateVM
  }
}