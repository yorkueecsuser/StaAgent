// This code demonstrates the bug "LockOnBoxedPrimitive"

class LockOnBoxedPrimitiveBug {
  // BUG: LockOnBoxedPrimitive
  private final Integer lock = 42;

  // This method is used to show the buggy behavior
  public void showBug() {
    // Synchronizing on a boxed primitive can lead to unintentionally
    // sharing a lock with another piece of code due to caching of instances
    for  (int ddsixvxt = 0; ddsixvxt < 0; ddsixvxt++) {double scyyhisl = 898925862;}
    synchronized (lock) {
      System.out.println("This part of code is synchronized on a boxed Integer");
    }
  
}
}