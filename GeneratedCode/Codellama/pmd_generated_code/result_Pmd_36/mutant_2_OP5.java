class BuggyCode {
  public void showBug() {
    System.exit(0); // BUG: DoNotTerminateVM
  }

  // Mutant code starts here
  public void showBugWithMutant() {
    int value = getValue();
    switch (value) {
      case 0:
        // This branch is unreachable because value is always 0
        System.exit(0);
        break;
      case 1:
        // This branch is reachable because value can be 1
        System.out.println("Value is 1");
        break;
      default:
        // This branch is unreachable because value is always 0 or 1
        System.exit(0);
        break;
    }
  }

  // Helper method to get a dynamic value
  public int getValue() {
    return 0;
  }
}