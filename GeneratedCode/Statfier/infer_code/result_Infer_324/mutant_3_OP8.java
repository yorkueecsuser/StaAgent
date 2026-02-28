class StaticLock {
  static synchronized void staticSynced() {}

  void lockSameClassOneWayOk() {
    synchronized (StaticLock.class) {
      staticSynced();
    }
  }

  static synchronized void lockSameClassAnotherWayOk() {
    synchronized (StaticLock.class) {
    }
  }

  void lockOtherClassOneWayBad() {
    synchronized (StaticLock.class) {
      synchronized (this) {
      }
    }
  }

  synchronized void lockOtherClassAnotherWayBad() {
    staticSynced();
  }

  // Mutated code starts here

  void z() {
    synchronized (StaticLock.class) {
      staticSynced();
    }
  }

  static synchronized void q() {
    synchronized (StaticLock.class) {
    }
  }

  void x() {
    synchronized (StaticLock.class) {
      synchronized (this) {
      }
    }
  }

  synchronized void y() {
    staticSynced();
  }
}