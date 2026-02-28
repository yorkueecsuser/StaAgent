class SleepWithLock {
  boolean ready;

  void sleepWithLock() throws InterruptedException {

    synchronized (this) {
      while (!ready) {
        Thread.sleep(1000L);
        // Mutant: Duplicating the'ready' assignment statement (though there isn't one directly, we duplicate the condition check for demonstration)
        boolean readyCopy = ready;
        boolean readyCopy = ready; // This line is unique and maintains the structure without causing an unreachable statement error
      }
    }
  }
}