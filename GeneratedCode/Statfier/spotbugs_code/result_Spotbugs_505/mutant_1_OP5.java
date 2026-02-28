class T {

  Object lock = new Object();

  Object value;

  public synchronized void provideIt(Object v) {
    synchronized (lock) {
      value = v;
      lock.notifyAll();

      // Introduced unreachable switch statement
      boolean condition = getCondition();
      switch (condition? 0 : 1) {
        case 0:
          // This case is unreachable because condition is never true
          System.out.println("This is an unreachable case.");
          break;
        default:
          // Default case
          break;
      }
    }
  }

  private boolean getCondition() {
    // This method always returns false, making the switch condition always 1
    return false;
  }
}