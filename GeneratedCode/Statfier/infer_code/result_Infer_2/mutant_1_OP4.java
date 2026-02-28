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
          // Alternative code that should also never run
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
          // Alternative code that should also never run
        }
      }
    }
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined but always returns false
  }
}