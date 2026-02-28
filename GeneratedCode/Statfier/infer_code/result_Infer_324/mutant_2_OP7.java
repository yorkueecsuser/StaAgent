class StaticLock {
  static synchronized void staticSynced() {}

  void lockSameClassOneWayOk() {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
    }
    synchronized (StaticLock.class) {
      staticSynced();
    }
  }

  static synchronized void lockSameClassAnotherWayOk() {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
    }
    synchronized (StaticLock.class) {
    }
  }

  void lockOtherClassOneWayBad() {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
    }
    synchronized (StaticLock.class) {
      synchronized (this) {
      }
    }
  }

  synchronized void lockOtherClassAnotherWayBad() {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
    }
    staticSynced();
  }

  private boolean getCondition() {
    return false;
  }
}