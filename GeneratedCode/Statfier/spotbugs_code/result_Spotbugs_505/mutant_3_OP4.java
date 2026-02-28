class T {

  Object lock = new Object();

  Object value;

  public synchronized void provideIt(Object v) {
    synchronized (lock) {
      value = v;
      lock.notifyAll();
      
      // Inserting unreachable if-else statement
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // This block is reachable if shouldRun is true
        System.out.println("This is a reachable block.");
      } else {
        // This block is unreachable because shouldRun is always false
        System.out.println("This is an unreachable block.");
      }
    }
  }

  private boolean getCondition() {
    // Always return false to make the else block unreachable
    return false;
  }
}