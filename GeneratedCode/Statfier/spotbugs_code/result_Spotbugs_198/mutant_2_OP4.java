class StaticLockInsideNotStaticSynchronizedMethod {

  private static final Object lock = new Object();
  private static int x = 0;
  private static int y = 0;

  public synchronized void foo() {
    synchronized (lock) {
      x++;
      y++;

      // Introduced unreachable if-else statement
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // This block will never execute because shouldRun is always false
        x--;
        y--;
      } else {
        // This block will always execute
        x++;
        y++;
      }
    }
  }

  // Method to return a constant false condition
  private boolean getCondition() {
    return false;
  }
}