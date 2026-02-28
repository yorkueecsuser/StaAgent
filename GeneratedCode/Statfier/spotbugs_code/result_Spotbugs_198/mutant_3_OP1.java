class StaticLockInsideNotStaticSynchronizedMethod {

  private static final Object lock = new Object();
  private static int x = 0;
  private static int y = 0;

  public synchronized void foo() {
    synchronized (lock) {
      x++;
      y++;
      // Dead Store Mutation
      int qzjfnrht = 42; // Unique variable declaration
    }
  }
}