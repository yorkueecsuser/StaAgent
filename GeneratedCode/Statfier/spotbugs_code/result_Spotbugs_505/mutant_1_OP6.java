class T {

  Object lock = new Object();

  Object value;

  public synchronized void provideIt(Object v) {
    synchronized (lock) {
      value = v;
      lock.notifyAll();

      // Inserting unreachable for loop
      boolean conditionFor = getCondition();
      for (int i = 0; conditionFor; i++) {
        // This loop is unreachable because getCondition() always returns false
      }
    }
  }

  private boolean getCondition() {
    return false;
  }
}