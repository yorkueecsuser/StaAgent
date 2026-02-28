class StaticLockInsideNotStaticSynchronizedMethod {

  private static final Object lock = new Object();
  private static int x = 0;
  private static int y = 0;

  public synchronized void foo() {
    boolean conditionFor = getConditionFor();
    for (int i = 0; conditionFor; i++) {
      // Unreachable code
    }

    synchronized (lock) {
      x++;
      y++;
    }
  }

  private boolean getConditionFor() {
    return false; // This ensures the loop is unreachable but not due to a compile-time constant
  }
}