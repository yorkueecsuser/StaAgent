class T {

  Object lock = new Object();

  Object value;

  public synchronized void provideIt(Object v) {
    synchronized (lock) {
      value = v;
      lock.notifyAll();
      
      // Introduced unreachable if statement according to mutation operator
      boolean condition = getUnreachableCondition();
      if (condition) {
        // This block is unreachable because getUnreachableCondition() always returns false
        value = null;
      }
    }
  }

  private boolean getUnreachableCondition() {
    return false;
  }
}