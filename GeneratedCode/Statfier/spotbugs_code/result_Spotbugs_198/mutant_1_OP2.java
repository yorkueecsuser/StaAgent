class StaticLockInsideNotStaticSynchronizedMethod {

  private static final Object lock = new Object();
  private static int x = 0;
  private static int y = 0;

  public synchronized void foo() {
    synchronized (lock) {
      x++;
      x++; // Mutant: duplicated assignment statement
      y++;
      y++; // Mutant: duplicated assignment statement
    }
  }
}