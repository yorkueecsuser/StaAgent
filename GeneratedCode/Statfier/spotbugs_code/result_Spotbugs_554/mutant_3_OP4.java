class SleepWithLock {
  boolean ready;

  void sleepWithLock() throws InterruptedException {

    synchronized (this) {
      while (!ready) {
        Thread.sleep(1000L);
      }

      // Mutant code start
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // This block will never execute because shouldRun is always false
      } else {
        // Alternative code that also will never execute due to the same reason
      }
    }
  }

  private boolean getCondition() {
    return false;
  }
}