class StaticLockInsideNotStaticSynchronizedMethod {

  private static final Object lock = new Object();
  private static int x = 0;
  private static int y = 0;

  public synchronized void foo() {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { // Unreachable for loop
      // This loop is unreachable because conditionFor is dynamically determined and set to false
    }

    synchronized (lock) {
      x++;
      y++;
    }
  }

  private boolean getCondition() {
    return false; // This method returns false, making the for loop unreachable
  }
}