class LocalLock {
  Object lock1, lock2;

  Object getLock1() {
    return lock1;
  }

  void localLockOuterOk() {
    synchronized (getLock1()) {
      synchronized (this) {
        boolean shouldRun = getCondition();
        if (shouldRun) {
          // Some code that should never run
        } else {
          // Some alternative code that should also never run
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
        boolean shouldRun = getCondition();
        if (shouldRun) {
          // Some code that should never run
        } else {
          // Some alternative code that should also never run
        }
      }
    }
  }

  private boolean getCondition() {
    // This method should return false to ensure the if-else branches are unreachable
    return false;
  }
}