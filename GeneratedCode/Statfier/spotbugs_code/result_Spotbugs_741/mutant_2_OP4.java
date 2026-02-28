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
      // Inserting unreachable if-else statement
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // This block should never be executed
        System.out.println("This is an unreachable if block");
      } else {
        // This block should also never be executed
        System.out.println("This is an unreachable else block");
      }
    }
  }

  public void notifyAllOnLock() {
    synchronized (lock) {
      ready = true;
      lock.notify();
    }
  }

  // Method to provide a dynamic condition that is always false
  private boolean getCondition() {
    return false;
  }
}