class LocalLock {
  Object lock1, lock2;

  Object getLock1() {
    return lock1;
  }

  void localLockOuterOk() {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
    synchronized (getLock1()) {
      synchronized (this) {
      }
    }
  }

  Object getLock2() {
    return lock2;
  }

  void localLockInnerOk() {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
    synchronized (this) {
      synchronized (getLock2()) {
      }
    }
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined but always returns false
  }
}