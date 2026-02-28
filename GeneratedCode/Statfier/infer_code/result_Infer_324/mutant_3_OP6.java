class StaticLock {
  static synchronized void staticSynced() {}

  void lockSameClassOneWayOk() {
    synchronized (StaticLock.class) {
      staticSynced();
      boolean conditionFor = getCondition();
      for (int i = 0; conditionFor; i++) {
        // Unreachable loop body
      }
    }
  }

  static synchronized void lockSameClassAnotherWayOk() {
    synchronized (StaticLock.class) {
      boolean conditionFor = getCondition();
      for (int i = 0; conditionFor; i++) {
        // Unreachable loop body
      }
    }
  }

  void lockOtherClassOneWayBad() {
    synchronized (StaticLock.class) {
      synchronized (this) {
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
          // Unreachable loop body
        }
      }
    }
  }

  synchronized void lockOtherClassAnotherWayBad() {
    staticSynced();
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable loop body
    }
  }

  private boolean getCondition() {
    return false;
  }
}