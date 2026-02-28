class T {

  Object lock = new Object();

  Object value;

  public synchronized void provideIt(Object v) {
    synchronized (lock) {
      value = v;
      lock.notifyAll();
      
      // Inserting an unreachable if branch
      boolean condition = getUnreachableCondition();
      if (condition) {
        // This block is unreachable
        value = null;
      }
    }
  }

  private boolean getUnreachableCondition() {
    return false; // This method always returns false, making the if block unreachable
  }
}