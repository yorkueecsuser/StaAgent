class T {

  Object lock = new Object();

  Object value;

  public synchronized void provideIt(Object v) {
    synchronized (lock) {
      value = v;
      lock.notifyAll();
      
      // Introduced unreachable for loop according to mutation operator
      boolean conditionFor = getCondition();
      for (int i = 0; conditionFor; i++) {
        // This loop is unreachable because conditionFor is never set to true
      }
    }
  }

  private boolean getCondition() {
    // This method returns false, making the for loop unreachable
    return false;
  }
}