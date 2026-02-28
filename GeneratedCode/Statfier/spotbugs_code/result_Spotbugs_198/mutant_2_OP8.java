class StaticLockInsideNotStaticSynchronizedMethod {

  private static final Object lock = new Object();
  private static int x = 0;
  private static int y = 0;

  public synchronized void foo() {
    synchronized (lock) {
      x++;
      y++;
    }
  }

  // Mutated code
  private static final Object a = new Object();
  private static int b = 0;
  private static int c = 0;

  public synchronized void bar() {
    synchronized (a) {
      b++;
      c++;
    }
  }
}