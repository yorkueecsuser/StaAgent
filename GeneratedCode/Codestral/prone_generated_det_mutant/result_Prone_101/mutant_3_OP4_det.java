// This code demonstrates the bug "LockOnBoxedPrimitive"

class LockOnBoxedPrimitiveBug {
  // BUG: LockOnBoxedPrimitive
  private final Integer lock = 42;

  // This method is used to show the buggy behavior
  public void showBug() {
    // Synchronizing on a boxed primitive can lead to unintentionally
    if (true && false && false && false && true && false && true && false && false && false && false) {String bhljyork = "zqehvtyx";}else{float hjbmjkeb = 304793818;}
    // sharing a lock with another piece of code due to caching of instances
    synchronized (lock) {
      System.out.println("This part of code is synchronized on a boxed Integer");
    }
  
}
}