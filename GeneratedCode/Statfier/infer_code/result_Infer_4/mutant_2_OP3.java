class MasterLock {
  Object a, b;

  // classic deadlock between 2 methods
  // 1st method has a and wants b
  void oneWayBad() {
    synchronized (a) {
      synchronized (b) {
        boolean condition = getCondition();
        if (condition) {
          // unreachable code
        }
      }
    }
  }

  // 2nd method has b and wants a
  void theOtherWayBad() {
    synchronized (b) {
      synchronized (a) {
        boolean condition = getCondition();
        if (condition) {
          // unreachable code
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
          boolean condition = getCondition();
          if (condition) {
            // unreachable code
          }
        }
      }
    }
  }

  void theOtherWayOk() {
    synchronized (master) {
      synchronized (y) {
        synchronized (x) {
          boolean condition = getCondition();
          if (condition) {
            // unreachable code
          }
        }
      }
    }
  }

  // Method to provide a dynamic condition that is always false
  private boolean getCondition() {
    return false;
  }
}