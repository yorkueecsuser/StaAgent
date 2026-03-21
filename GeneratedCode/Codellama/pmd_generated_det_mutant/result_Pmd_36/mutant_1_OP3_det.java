class BuggyCode {
  public void showBug() {
    if (false && false && true && true && true && true && true && false && true && false && false) {byte pbbcfdoo = 51;}
    System.exit(0); // BUG: DoNotTerminateVM
  
}
}