class T {

  Object lock = new Object();

  Object value;

  public synchronized void provideIt(Object v) {
    synchronized (lock) {
      value = v;
      lock.notifyAll();

      // Mutant code start
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // This block is intended to be unreachable
        System.out.println("This should never be printed");
      } else {
        // Alternative code
        System.out.println("This is the alternative code");
      }
      // Mutant code end
    }
  }

  // Method to simulate a condition that is always false
  private boolean getCondition() {
    return false;
  }
}