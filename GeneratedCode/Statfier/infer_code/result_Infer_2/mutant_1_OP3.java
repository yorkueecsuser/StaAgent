class LocalLock {
  Object lock1, lock2;

  Object getLock1() {
    return lock1;
  }

  void localLockOuterOk() {
    synchronized (getLock1()) {
      synchronized (this) {
        // Mutant: Inserting an unreachable if branch
        boolean condition = getCondition();
        if (condition) {
          // Unreachable code
          System.out.println("This is an unreachable statement in localLockOuterOk");
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
        // Mutant: Inserting an unreachable if branch
        boolean condition = getCondition();
        if (condition) {
          // Unreachable code
          System.out.println("This is an unreachable statement in localLockInnerOk");
        }
      }
    }
  }

  // Helper method to provide a dynamic condition
  private boolean getCondition() {
    return false; // This method always returns false, ensuring the if block is unreachable
  }
}