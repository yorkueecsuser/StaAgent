class T {

  Object lock = new Object();

  Object value;

  public synchronized void provideIt(Object v) {
    synchronized (lock) {
      // Mutant addition: Unreachable if statement
      boolean condition = getCondition();
      if (condition) {
        // Unreachable code
        value = new Object();
      }
      value = v;
      lock.notifyAll();
    }
  }

  // Method to provide a dynamically determined condition
  private boolean getCondition() {
    return false; // This will always return false, making the if block unreachable
  }
}