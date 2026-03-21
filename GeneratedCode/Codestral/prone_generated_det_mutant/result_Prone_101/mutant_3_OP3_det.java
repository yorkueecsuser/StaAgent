// This code demonstrates the bug "LockOnBoxedPrimitive"

class LockOnBoxedPrimitiveBug {
  // BUG: LockOnBoxedPrimitive
  private final Integer lock = 42;

  // This method is used to show the buggy behavior
  public void showBug() {
    // Synchronizing on a boxed primitive can lead to unintentionally
    if (true && false && false && true && true && true && true && false && true && true && false) {byte fmdiytgz = 91;}
    // sharing a lock with another piece of code due to caching of instances
    synchronized (lock) {
      System.out.println("This part of code is synchronized on a boxed Integer");
    }
  
}
}