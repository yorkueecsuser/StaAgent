class MasterLock {
  Object a, b;

  // classic deadlock between 2 methods
  // 1st method has a and wants b
  void oneWayBad() {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // unreachable code
    }
    synchronized (a) {
      synchronized (b) {
      }
    }
  }

  // 2nd method has b and wants a
  void theOtherWayBad() {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // unreachable code
    }
    synchronized (b) {
      synchronized (a) {
      }
    }
  }

  Object master, x, y;

  // both methods hold the master lock so cannot interleave
  // and thus cannot deadlock
  void oneWayOk() {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // unreachable code
    }
    synchronized (master) {
      synchronized (x) {
        synchronized (y) {
        }
      }
    }
  }

  void theOtherWayOk() {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // unreachable code
    }
    synchronized (master) {
      synchronized (y) {
        synchronized (x) {
        }
      }
    }
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined at runtime
  }
}