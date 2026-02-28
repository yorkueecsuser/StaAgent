class T {

  Object lock = new Object();

  Object value;

  public synchronized void provideIt(Object v) {
    synchronized (lock) {
      value = v;
      lock.notifyAll();
      
      // Mutant code added here
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // This block will never execute because shouldRun is always false
        System.out.println("This is an unreachable if block");
      } else {
        // This block will also never execute because shouldRun is always false
        System.out.println("This is an unreachable else block");
      }
    }
  }

  // Method to return a condition that is always false
  private boolean getCondition() {
    return false;
  }
}