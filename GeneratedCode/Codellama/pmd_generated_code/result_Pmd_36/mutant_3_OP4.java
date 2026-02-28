class BuggyCode {
  public void showBug() {
    System.exit(0); // BUG: DoNotTerminateVM
  }

  // Inserted unreachable if-else branch
  if (false) {
    // Unreachable code
    System.out.println("Unreachable code executed");
  } else {
    // Reachable code
    System.out.println("Reachable code executed");
  }
}