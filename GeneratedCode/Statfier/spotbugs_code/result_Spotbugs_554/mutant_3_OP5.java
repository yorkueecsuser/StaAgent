class SleepWithLock {
  boolean ready;

  void sleepWithLock() throws InterruptedException {

    synchronized (this) {
      while (!ready) {
        Thread.sleep(1000L);
      }
      
      // Inserting an unreachable switch statement
      boolean condition = getCondition();
      switch (condition? 0 : 1) {
        case 0:
          // This case will never be reached because condition is always false
          System.out.println("This is an unreachable case.");
          break;
        case 1:
          // This case will always be executed
          System.out.println("This is the reachable case.");
          break;
      }
    }
  }

  private boolean getCondition() {
    return false;
  }
}