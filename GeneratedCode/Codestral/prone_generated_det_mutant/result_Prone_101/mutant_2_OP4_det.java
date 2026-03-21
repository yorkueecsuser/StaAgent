// This code demonstrates the bug "LockOnBoxedPrimitive"

class LockOnBoxedPrimitiveBug {
  // BUG: LockOnBoxedPrimitive
  private final Integer lock = 42;

  // This method is used to show the buggy behavior
  public void showBug() {
    if (true && false && false && false && false && true && true && false && true && false && false) {double ladrktxh = 796565218;}else{long tefxsvqy = 621923985;}
    // Synchronizing on a boxed primitive can lead to unintentionally
    // sharing a lock with another piece of code due to caching of instances
    synchronized (lock) {
      System.out.println("This part of code is synchronized on a boxed Integer");
    }
  
}
}