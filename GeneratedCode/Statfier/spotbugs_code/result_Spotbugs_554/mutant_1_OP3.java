class SleepWithLock {
  boolean ready;
  boolean unreachableCondition = false;

  void sleepWithLock() throws InterruptedException {

    synchronized (this) {
      while (!ready) {
        Thread.sleep(1000L);
      }
      // Inserting unreachable if branch
      if (unreachableCondition) {
        System.out.println("This is an unreachable statement");
      }
    }
  }
}