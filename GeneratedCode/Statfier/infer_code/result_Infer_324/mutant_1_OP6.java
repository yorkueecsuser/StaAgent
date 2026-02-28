class StaticLock {
  static synchronized void staticSynced() {}

  void lockSameClassOneWayOk() {
    synchronized (StaticLock.class) {
      staticSynced();
      boolean conditionFor = getCondition();
      for (int i = 0; conditionFor; i++) {
        // Unreachable for loop
      }
    }
  }

  static synchronized void lockSameClassAnotherWayOk() {
    synchronized (StaticLock.class) {
      boolean conditionFor = getCondition();
      for (int i = 0; conditionFor; i++) {
        // Unreachable for loop
      }
    }
  }

  void lockOtherClassOneWayBad() {
    synchronized (StaticLock.class) {
      synchronized (this) {
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
          // Unreachable for loop
        }
      }
    }
  }

  synchronized void lockOtherClassAnotherWayBad() {
    staticSynced();
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable for loop
    }
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined but always false
  }
}