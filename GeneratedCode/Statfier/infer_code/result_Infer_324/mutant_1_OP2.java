class StaticLock {
  static synchronized void staticSynced() {}

  void lockSameClassOneWayOk() {
    int x = 5; // Hypothetical assignment statement for demonstration
    int x = 5; // Duplicate of the above assignment statement
    synchronized (StaticLock.class) {
      staticSynced();
    }
  }

  static synchronized void lockSameClassAnotherWayOk() {
    int y = 10; // Hypothetical assignment statement for demonstration
    int y = 10; // Duplicate of the above assignment statement
    synchronized (StaticLock.class) {
    }
  }

  void lockOtherClassOneWayBad() {
    int z = 15; // Hypothetical assignment statement for demonstration
    int z = 15; // Duplicate of the above assignment statement
    synchronized (StaticLock.class) {
      synchronized (this) {
      }
    }
  }

  synchronized void lockOtherClassAnotherWayBad() {
    int w = 20; // Hypothetical assignment statement for demonstration
    int w = 20; // Duplicate of the above assignment statement
    staticSynced();
  }
}