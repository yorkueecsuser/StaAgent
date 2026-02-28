class LocalLock {
  Object lock1, lock2;

  Object getLock1() {
    return lock1;
  }

  void localLockOuterOk() {
    synchronized (getLock1()) {
      synchronized (this) {
        // Unreachable for loop
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
          // This loop is unreachable because getCondition() always returns false
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
        // Unreachable for loop
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
          // This loop is unreachable because getCondition() always returns false
        }
      }
    }
  }

  // Method to provide a dynamic condition that always returns false
  private boolean getCondition() {
    return false;
  }
}