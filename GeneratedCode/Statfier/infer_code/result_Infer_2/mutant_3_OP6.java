class LocalLock {
  Object lock1, lock2;

  Object getLock1() {
    return lock1;
  }

  void localLockOuterOk() {
    synchronized (getLock1()) {
      synchronized (this) {
        // Introduced unreachable for loop
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
          // Unreachable code
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
        // Introduced unreachable for loop
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
          // Unreachable code
        }
      }
    }
  }

  // Method to provide a dynamic condition for the for loop
  private boolean getCondition() {
    return false; // This will ensure the loop is unreachable but not due to a compile-time constant
  }
}