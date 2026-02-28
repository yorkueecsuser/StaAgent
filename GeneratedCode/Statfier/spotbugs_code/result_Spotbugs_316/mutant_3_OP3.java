class TwoLockWait {

  Object lock = new Object();

  Object value;

  public synchronized void provideIt(Object v) {
    synchronized (lock) {
      value = v;
      lock.notifyAll();
      // Inserting unreachable if statement
      boolean condition = getCondition();
      if (condition) {
        // This block is unreachable
        value = null;
      }
    }
  }

  public synchronized Object waitForIt() throws InterruptedException {
    synchronized (lock) {
      while (value == null) lock.wait();
      return value;
    }
  }

  public void myMethod(Object a, Object b) {
    try {
      synchronized (a) {
        synchronized (b) {
          a.wait();
          // Inserting unreachable if statement
          boolean condition = getCondition();
          if (condition) {
            // This block is unreachable
            System.out.println("This is unreachable");
          }
        }
      }
    } catch (InterruptedException e) {
      System.out.println("Interrupted");
    }
  }

  // Method to provide a dynamic condition that is always false
  private boolean getCondition() {
    return false;
  }
}