class LocalLock {
  Object lock1, lock2;

  Object getLock1() {
    return lock1;
  }

  void localLockOuterOk() {
    synchronized (getLock1()) {
      synchronized (this) {
        // Introduced unreachable switch statement
        boolean alwaysFalse = getAlwaysFalse();
        switch (alwaysFalse) {
          case true:
            System.out.println("This is unreachable");
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
        // Introduced unreachable switch statement
        boolean alwaysFalse = getAlwaysFalse();
        switch (alwaysFalse) {
          case true:
            System.out.println("This is unreachable");
            break;
        }
      }
    }
  }

  private boolean getAlwaysFalse() {
    return false;
  }
}