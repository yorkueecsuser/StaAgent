class BuggyCode {
  public void showBug() {
    System.exit(0); // BUG: DoNotTerminateVM
  }

  public void showMutatedBug(int x) {
    for (int i = 0; false; i++) {
      // unreachable code
      System.out.println("This code is unreachable");
    }

    // rest of the method's code
    System.exit(0);
  }
}