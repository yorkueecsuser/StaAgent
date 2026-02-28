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

  void a() {
    synchronized (StaticLock.class) {
      staticSynced();
    }
  }

  static synchronized void b() {
    synchronized (StaticLock.class) {
    }
  }

  void c() {
    synchronized (StaticLock.class) {
      synchronized (this) {
      }
    }
  }

  synchronized void d() {
    staticSynced();
  }
}