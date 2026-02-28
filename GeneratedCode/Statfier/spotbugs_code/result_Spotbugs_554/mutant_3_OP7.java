class SleepWithLock {
  boolean ready;
  boolean conditionWhile = false; // Non-final variable to make the while loop condition dynamic

  void sleepWithLock() throws InterruptedException {

    synchronized (this) {
      while (!ready) {
        Thread.sleep(1000L);
      }
    }

    // Inserting unreachable while loop
    while (conditionWhile) {
      // This loop is unreachable because conditionWhile is initialized to false and never changed
      System.out.println("This is an unreachable loop");
    }
  }
}