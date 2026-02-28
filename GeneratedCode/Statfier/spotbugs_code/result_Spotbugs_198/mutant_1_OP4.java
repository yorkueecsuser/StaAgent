class StaticLockInsideNotStaticSynchronizedMethod {

  private static final Object lock = new Object();
  private static int x = 0;
  private static int y = 0;

  public synchronized void foo() {
    synchronized (lock) {
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // Some code that will never execute because getCondition() always returns false
        x += 10;
        y += 10;
      } else {
        // Original code
        x++;
        y++;
      }
    }
  }

  private boolean getCondition() {
    // This method always returns false, making the if branch unreachable
    return false;
  }
}