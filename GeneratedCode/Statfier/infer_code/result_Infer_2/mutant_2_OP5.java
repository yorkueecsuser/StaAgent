class LocalLock {
  Object lock1, lock2;

  Object getLock1() {
    return lock1;
  }

  void localLockOuterOk() {
    synchronized (getLock1()) {
      synchronized (this) {
        // Unreachable switch statement
        boolean condition = getCondition();
        switch(condition) {
          case true:
            // This case is unreachable because getCondition() never returns true
            System.out.println("This is an unreachable case.");
            break;
        }
      }
    }
  }

  Object getLock2() {
    return lock2;
  }

  void localLockInnerOk() {
    synchronized (this) {
      synchronized (getLock2()) {
        // Unreachable switch statement
        boolean condition = getCondition();
        switch(condition) {
          case true:
            // This case is unreachable because getCondition() never returns true
            System.out.println("This is another unreachable case.");
            break;
        }
      }
    }
  }

  // Method to provide a dynamic condition that never evaluates to true
  private boolean getCondition() {
    return false;
  }
}