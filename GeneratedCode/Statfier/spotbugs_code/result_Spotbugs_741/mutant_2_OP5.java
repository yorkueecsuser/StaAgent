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
      // Inserting an unreachable switch statement
      boolean condition = getCondition();
      switch (condition) {
        case true:
          // This case will never be reached because getCondition() does not return true
          System.out.println("This is an unreachable case.");
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

  // Method to provide a dynamic condition for the switch statement
  private boolean getCondition() {
    return false;
  }
}