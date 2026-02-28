class MasterLock {
  Object a, b;

  // classic deadlock between 2 methods
  // 1st method has a and wants b
  void oneWayBad() {
    synchronized (a) {
      synchronized (b) {
        boolean shouldRun = getCondition();
        if (shouldRun) {
          // Some unreachable code
        } else {
          // Another unreachable code
        }
      }
    }
  }

  // 2nd method has b and wants a
  void theOtherWayBad() {
    synchronized (b) {
      synchronized (a) {
        boolean shouldRun = getCondition();
        if (shouldRun) {
          // Some unreachable code
        } else {
          // Another unreachable code
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
          boolean shouldRun = getCondition();
          if (shouldRun) {
            // Some unreachable code
          } else {
            // Another unreachable code
          }
        }
      }
    }
  }

  void theOtherWayOk() {
    synchronized (master) {
      synchronized (y) {
        synchronized (x) {
          boolean shouldRun = getCondition();
          if (shouldRun) {
            // Some unreachable code
          } else {
            // Another unreachable code
          }
        }
      }
    }
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined but always returns false
  }
}