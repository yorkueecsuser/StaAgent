class StaticLock {
  static synchronized void staticSynced() {}

  void lockSameClassOneWayOk() {
    synchronized (StaticLock.class) {
      staticSynced();
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // Some code
      } else {
        // Unreachable code
      }
    }
  }

  static synchronized void lockSameClassAnotherWayOk() {
    synchronized (StaticLock.class) {
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // Some code
      } else {
        // Unreachable code
      }
    }
  }

  void lockOtherClassOneWayBad() {
    synchronized (StaticLock.class) {
      synchronized (this) {
        boolean shouldRun = getCondition();
        if (shouldRun) {
          // Some code
        } else {
          // Unreachable code
        }
      }
    }
  }

  synchronized void lockOtherClassAnotherWayBad() {
    staticSynced();
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code
    } else {
      // Unreachable code
    }
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined at runtime
  }
}