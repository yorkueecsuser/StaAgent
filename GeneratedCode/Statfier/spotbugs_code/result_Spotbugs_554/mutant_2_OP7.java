class SleepWithLock {
  boolean ready;
  boolean conditionWhile = false;

  void sleepWithLock() throws InterruptedException {

    synchronized (this) {
      while (!ready) {
        Thread.sleep(1000L);
      }
    }

    // Unreachable while loop
    while (conditionWhile) {
      // This loop is unreachable because conditionWhile is always false
      System.out.println("This is an unreachable loop");
    }
  }
}