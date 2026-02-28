class LocalLock {
  Object lock1, lock2;

  Object getLock1() {
    return lock1;
  }

  void localLockOuterOk() {
    synchronized (getLock1()) {
      synchronized (this) {
        boolean condition = getCondition();
        if (condition) {
          // Unreachable code
          System.out.println("This is an unreachable if statement");
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
        boolean condition = getCondition();
        if (condition) {
          // Unreachable code
          System.out.println("This is another unreachable if statement");
        }
      }
    }
  }

  private boolean getCondition() {
    // This method should return false to ensure the if statements are unreachable
    return false;
  }
}