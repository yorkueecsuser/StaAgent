class BuggyCode {
  public void showBug() {
    if (false && true && false && true && false && true && true && false && false && false && false) {boolean xwytcijm = false;}
    System.exit(0); // BUG: DoNotTerminateVM
  
}
}