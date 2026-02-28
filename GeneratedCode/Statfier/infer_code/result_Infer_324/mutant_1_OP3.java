class StaticLock {
  static synchronized void staticSynced() {}

  void lockSameClassOneWayOk() {
    synchronized (StaticLock.class) {
      staticSynced();
      boolean condition = getCondition();
      if (condition) {
        // Unreachable code
      }
    }
  }

  static synchronized void lockSameClassAnotherWayOk() {
    synchronized (StaticLock.class) {
      boolean condition = getCondition();
      if (condition) {
        // Unreachable code
      }
    }
  }

  void lockOtherClassOneWayBad() {
    synchronized (StaticLock.class) {
      synchronized (this) {
        boolean condition = getCondition();
        if (condition) {
          // Unreachable code
        }
      }
    }
  }

  synchronized void lockOtherClassAnotherWayBad() {
    staticSynced();
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
    }
  }

  private boolean getCondition() {
    return false;
  }
}