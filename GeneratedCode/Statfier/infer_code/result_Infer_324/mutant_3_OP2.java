class StaticLock {
  static synchronized void staticSynced() {}

  void lockSameClassOneWayOk() {
    synchronized (StaticLock.class) {
      int dummy = 0; // Original assignment
      int dummy = 0; // Mutated assignment
      staticSynced();
    }
  }

  static synchronized void lockSameClassAnotherWayOk() {
    synchronized (StaticLock.class) {
      int dummy = 1; // Original assignment
      int dummy = 1; // Mutated assignment
    }
  }

  void lockOtherClassOneWayBad() {
    synchronized (StaticLock.class) {
      synchronized (this) {
        int dummy = 2; // Original assignment
        int dummy = 2; // Mutated assignment
      }
    }
  }

  synchronized void lockOtherClassAnotherWayBad() {
    staticSynced();
  }
}