class MasterLock {
  Object a, b;

  // classic deadlock between 2 methods
  // 1st method has a and wants b
  void oneWayBad() {
    synchronized (a) {
      synchronized (b) {
        boolean condition = getCondition();
        if (condition) {
          // Some code that won't run
        } else {
          // Some alternative code that won't run
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
          // Some code that won't run
        } else {
          // Some alternative code that won't run
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
            // Some code that won't run
          } else {
            // Some alternative code that won't run
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
            // Some code that won't run
          } else {
            // Some alternative code that won't run
          }
        }
      }
    }
  }

  // Method to provide a dynamic condition
  private boolean getCondition() {
    return false; // This will always return false, making the if-else branches unreachable
  }
}