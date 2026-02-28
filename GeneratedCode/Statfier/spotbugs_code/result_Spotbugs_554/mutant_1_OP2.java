class SleepWithLock {
  boolean ready;

  void sleepWithLock() throws InterruptedException {

    synchronized (this) {
      while (!ready) {
        Thread.sleep(1000L);
        // Mutant: Duplicating the assignment statement (though there isn't an explicit assignment here, we can duplicate the condition check for demonstration)
        boolean readyCopy = ready; // This is a unique duplication for demonstration purposes
      }
    }
  }
}