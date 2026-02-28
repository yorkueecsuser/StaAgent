class MasterLock {
  Object a, b;

  // classic deadlock between 2 methods
  // 1st method has a and wants b
  void oneWayBad() {
    synchronized (a) {
      synchronized (b) {
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
          // unreachable loop
        }
      }
    }
  }

  // 2nd method has b and wants a
  void theOtherWayBad() {
    synchronized (b) {
      synchronized (a) {
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
          // unreachable loop
        }
      }
    }
  }

  Object master, x, y;

  // both methods hold the master lock so cannot interleave
  // and thus cannot deadlock
  void oneWayOk() {
    synchronized (master) {
      synchronized (x) {
        synchronized (y) {
          boolean conditionFor = getCondition();
          for (int i = 0; conditionFor; i++) {
            // unreachable loop
          }
        }
      }
    }
  }

  void theOtherWayOk() {
    synchronized (master) {
      synchronized (y) {
        synchronized (x) {
          boolean conditionFor = getCondition();
          for (int i = 0; conditionFor; i++) {
            // unreachable loop
          }
        }
      }
    }
  }

  private boolean getCondition() {
    return false;
  }
}