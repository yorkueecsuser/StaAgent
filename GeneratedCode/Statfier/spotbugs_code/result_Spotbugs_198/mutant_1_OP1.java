class StaticLockInsideNotStaticSynchronizedMethod {

  private static final Object lock = new Object();
  private static int x = 0;
  private static int y = 0;

  public synchronized void foo() {
    synchronized (lock) {
      x++;
      y++;
      // Dead store mutation
      int abcdefgh = 42; // Unique unused variable declaration
    }
  }
}