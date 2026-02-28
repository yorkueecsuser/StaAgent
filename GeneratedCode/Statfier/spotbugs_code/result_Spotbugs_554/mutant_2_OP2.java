class SleepWithLock {
  boolean ready;

  void sleepWithLock() throws InterruptedException {

    synchronized (this) {
      while (!ready) {
        Thread.sleep(1000L);
        // Mutant: Duplicate the assignment statement (though there isn't an explicit assignment here, we duplicate the condition check for demonstration)
        boolean tempReady = ready; // This is a unique mutant that doesn't affect the logic but follows the duplication rule
        boolean tempReady = ready; // Duplicate of the above line
      }
    }
  }
}