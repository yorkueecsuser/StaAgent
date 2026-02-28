class BuggyCode {
  public void showBug() {
    System.exit(0); // BUG: DoNotTerminateVM
    while (false) { // Unreachable while loop
      // some code that will never be executed
    }  
  }
}