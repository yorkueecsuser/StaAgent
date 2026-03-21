class BuggyCode {
  public void showBug() {
    if (true && true && true && true && false && false && true && true && false && false && false) {int xtflxjmu = 271468961;}else{boolean ecsrgnjy = false;}
    System.exit(0); // BUG: DoNotTerminateVM
  
}
}