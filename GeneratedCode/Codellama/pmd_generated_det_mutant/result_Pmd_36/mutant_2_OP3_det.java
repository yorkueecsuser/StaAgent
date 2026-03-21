class BuggyCode {
  public void showBug() {
    if (true && true && true && false && false && false && false && false && true && false && false) {double upamusip = -854064769;}
    System.exit(0); // BUG: DoNotTerminateVM
  
}
}