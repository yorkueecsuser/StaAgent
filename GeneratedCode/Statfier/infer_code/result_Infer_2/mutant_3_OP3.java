class LocalLock {
  Object lock1, lock2;

  Object getLock1() {
    return lock1;
  }

  void localLockOuterOk() {
    synchronized (getLock1()) {
      synchronized (this) {
        // Mutant: Adding an unreachable if statement
        boolean condition = getCondition();
        if (condition) {
          // This block is unreachable because getCondition() always returns false
          System.out.println("This is an unreachable statement");
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
        // Mutant: Adding an unreachable if statement
        boolean condition = getCondition();
        if (condition) {
          // This block is unreachable because getCondition() always returns false
          System.out.println("This is another unreachable statement");
        }
      }
    }
  }

  // Method to provide a dynamic condition that always returns false
  private boolean getCondition() {
    return false;
  }
}