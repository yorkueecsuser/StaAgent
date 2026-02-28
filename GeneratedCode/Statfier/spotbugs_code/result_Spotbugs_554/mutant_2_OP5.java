class SleepWithLock {
  boolean ready;

  void sleepWithLock() throws InterruptedException {

    synchronized (this) {
      while (!ready) {
        Thread.sleep(1000L);
      }

      // Inserting an unreachable switch statement
      boolean condition = getCondition();
      switch (condition) {
        case true:
          System.out.println("This will never be printed");
          break;
        default:
          System.out.println("This will also never be printed");
          break;
      }
    }
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined but always false
  }
}