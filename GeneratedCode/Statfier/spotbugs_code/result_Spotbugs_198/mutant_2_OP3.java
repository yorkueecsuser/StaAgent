class StaticLockInsideNotStaticSynchronizedMethod {

  private static final Object lock = new Object();
  private static int x = 0;
  private static int y = 0;

  public synchronized void foo() {
    synchronized (lock) {
      x++;
      y++;
      // Inserting unreachable if branch
      boolean condition = getUnreachableCondition();
      if (condition) {
        x--; // This line is unreachable
        y--; // This line is unreachable
      }
    }
  }

  private boolean getUnreachableCondition() {
    return false; // This method will always return false, making the if block unreachable
  }
}