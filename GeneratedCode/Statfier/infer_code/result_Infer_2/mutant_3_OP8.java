class LocalLock {
  Object lock1, lock2;

  Object getLock1() {
    return lock1;
  }

  void localLockOuterOk() {
    synchronized (getLock1()) {
      synchronized (this) {
      }
    }
  }

  Object getLock2() {
    return lock2;
  }

  void localLockInnerOk() {
    synchronized (this) {
      synchronized (getLock2()) {
      }
    }
  }

  // Mutated code
  Object a, b;

  Object getA() {
    return a;
  }

  void localLockOuterOkMutant() {
    synchronized (getA()) {
      synchronized (this) {
      }
    }
  }

  Object getB() {
    return b;
  }

  void localLockInnerOkMutant() {
    synchronized (this) {
      synchronized (getB()) {
      }
    }
  }
}