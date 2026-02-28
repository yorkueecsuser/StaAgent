class TwoLockWait {

  Object lock = new Object();

  Object value;

  public synchronized void provideIt(Object v) {
    synchronized (lock) {
      value = v;
      lock.notifyAll();
      boolean conditionFor = getCondition();
      for (int i = 0; conditionFor; i++) { // Unreachable for loop
        // This loop is unreachable because conditionFor is dynamically determined and set to false
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
          boolean conditionFor = getCondition();
          for (int i = 0; conditionFor; i++) { // Unreachable for loop
            // This loop is unreachable because conditionFor is dynamically determined and set to false
          }
        }
      }
    } catch (InterruptedException e) {
      System.out.println("Interrupted");
    }
  }

  private boolean getCondition() {
    return false; // This method returns false, making the for loop condition always false
  }
}