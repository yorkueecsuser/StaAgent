class StaticLock {
  static synchronized void staticSynced() {}

  void lockSameClassOneWayOk() {
    synchronized (StaticLock.class) {
      staticSynced();
    }
    synchronized (StaticLock.class) { // Duplicate synchronization block
      staticSynced();
    }
  }

  static synchronized void lockSameClassAnotherWayOk() {
    synchronized (StaticLock.class) {
    }
    synchronized (StaticLock.class) { // Duplicate synchronization block
    }
  }

  void lockOtherClassOneWayBad() {
    synchronized (StaticLock.class) {
      synchronized (this) {
      }
    }
    synchronized (StaticLock.class) { // Duplicate synchronization block
      synchronized (this) {
      }
    }
  }

  synchronized void lockOtherClassAnotherWayBad() {
    staticSynced();
    staticSynced(); // Duplicate method call to simulate duplication of an implicit action
  }
}