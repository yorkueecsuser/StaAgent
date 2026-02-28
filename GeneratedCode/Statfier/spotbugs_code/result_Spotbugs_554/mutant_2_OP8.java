class SleepWithLock {
  boolean ready;

  void sleepWithLock() throws InterruptedException {

    synchronized (this) {
      while (!ready) {
        Thread.sleep(1000L);
      }
    }
  }

  // Mutated code
  boolean x;

  void sleepWithLockMutant() throws InterruptedException {

    synchronized (this) {
      while (!x) {
        Thread.sleep(1000L);
      }
    }
  }
}