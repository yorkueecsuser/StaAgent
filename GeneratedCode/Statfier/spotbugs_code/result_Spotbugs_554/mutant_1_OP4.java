class SleepWithLock {
  boolean ready;
  boolean unreachableCondition = false;

  void sleepWithLock() throws InterruptedException {

    synchronized (this) {
      while (!ready) {
        Thread.sleep(1000L);
      }
      // Inserting unreachable if-else statement
      if (unreachableCondition) {
        System.out.println("This is an unreachable if block");
      } else {
        System.out.println("This is an unreachable else block");
      }
    }
  }
}