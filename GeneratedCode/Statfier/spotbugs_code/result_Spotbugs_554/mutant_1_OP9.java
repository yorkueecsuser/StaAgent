class SleepWithLock {
  boolean ready;

  void sleepWithLock() throws InterruptedException {

    synchronized (this) {
      do {
        if (!ready) {
          Thread.sleep(1000L);
        }
      } while (!ready);
    }
  }
}