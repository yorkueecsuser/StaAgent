class StaticLockInsideNotStaticSynchronizedMethod {

  private static final Object lock = new Object();
  private static int x = 0;
  private static int y = 0;

  public synchronized void foo() {
    synchronized (lock) {
      x++;
      y++;

      // Inserting unreachable switch statement
      boolean condition = getCondition();
      switch (condition? 0 : 1) {
        case 0:
          // This case is unreachable because condition is never true
          x = -1;
          y = -1;
          break;
        default:
          // Default case to ensure switch is not empty and reachable
          break;
      }
    }
  }

  private boolean getCondition() {
    // This method always returns false, making the switch statement unreachable
    return false;
  }
}