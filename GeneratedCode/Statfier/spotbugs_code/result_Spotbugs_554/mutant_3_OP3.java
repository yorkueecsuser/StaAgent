class SleepWithLock {
  boolean ready;
  boolean condition = getCondition();

  void sleepWithLock() throws InterruptedException {

    synchronized (this) {
      while (!ready) {
        Thread.sleep(1000L);
      }
    }

    // Introduced unreachable if statement
    if (condition) {
      // This block is unreachable because condition is set to a method that returns false
      System.out.println("This is an unreachable statement.");
    }
  }

  private boolean getCondition() {
    return false;
  }
}