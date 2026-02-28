class StaticLockInsideNotStaticSynchronizedMethod {

  private static final Object lock = new Object();
  private static int x = 0;
  private static int y = 0;

  public synchronized void foo() {
    synchronized (lock) {
      x++;
      y++;

      // Mutant code start
      boolean condition = getCondition();
      if (condition) {
        // This block is unreachable because getCondition() always returns false
        x = x - 1;
        y = y - 1;
      }
      // Mutant code end
    }
  }

  private boolean getCondition() {
    return false;
  }
}