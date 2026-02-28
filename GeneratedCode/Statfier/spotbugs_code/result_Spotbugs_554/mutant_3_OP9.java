class SleepWithLock {
  boolean ready;

  void sleepWithLock() throws InterruptedException {

    synchronized (this) {
      do {
        Thread.sleep(1000L);
      } while (!ready);
    }
  }
}