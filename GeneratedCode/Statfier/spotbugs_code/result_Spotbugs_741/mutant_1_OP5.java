class MismatchedWaitFalsePositive {
  Object lock;

  boolean ready = false;

  MismatchedWaitFalsePositive(Object x) {
    lock = x;
  }

  public void waitOnLock() {
    synchronized (lock) {
      while (!ready) {
        try {
          lock.wait();
          return;
        } catch (InterruptedException e) {
          // TODO Auto-generated catch block
          e.printStackTrace();
        }
      }
      // Introduced unreachable switch statement
      boolean condition = getCondition();
      switch (condition) {
        case true:
          // This case is unreachable because getCondition() always returns false
          System.out.println("This is an unreachable case");
          break;
        default:
          // Default case
          break;
      }
    }
  }

  public void notifyAllOnLock() {
    synchronized (lock) {
      ready = true;
      lock.notify();
    }
  }

  // Method to provide a dynamic condition that always evaluates to false
  private boolean getCondition() {
    return false;
  }
}