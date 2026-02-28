class SleepWithLock {
  boolean ready;

  void sleepWithLock() throws InterruptedException {

    synchronized (this) {
      while (!ready) {
        Thread.sleep(1000L);
      }
      
      // Mutant code: Inserting an unreachable if branch
      boolean condition = getCondition();
      if (condition) {
        // This block is unreachable because getCondition() always returns false
        System.out.println("This is an unreachable statement.");
      }
    }
  }

  // Method to provide a dynamic but always false condition
  private boolean getCondition() {
    return false;
  }
}