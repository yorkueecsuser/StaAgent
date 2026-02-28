class MasterLock {
  Object a, b;

  // classic deadlock between 2 methods
  // 1st method has a and wants b
  void oneWayBad() {
    synchronized (a) {
      synchronized (b) {
        // Inserting unreachable switch statement
        boolean condition = getCondition();
        switch (condition? 0 : 1) {
          case 0:
            // This case is unreachable because condition is always false
            System.out.println("This will never be printed");
            break;
        }
      }
    }
  }

  // 2nd method has b and wants a
  void theOtherWayBad() {
    synchronized (b) {
      synchronized (a) {
        // Inserting unreachable switch statement
        boolean condition = getCondition();
        switch (condition? 0 : 1) {
          case 0:
            // This case is unreachable because condition is always false
            System.out.println("This will never be printed");
            break;
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
          // Inserting unreachable switch statement
          boolean condition = getCondition();
          switch (condition? 0 : 1) {
            case 0:
              // This case is unreachable because condition is always false
              System.out.println("This will never be printed");
              break;
          }
        }
      }
    }
  }

  void theOtherWayOk() {
    synchronized (master) {
      synchronized (y) {
        synchronized (x) {
          // Inserting unreachable switch statement
          boolean condition = getCondition();
          switch (condition? 0 : 1) {
            case 0:
              // This case is unreachable because condition is always false
              System.out.println("This will never be printed");
              break;
          }
        }
      }
    }
  }

  // Helper method to provide a dynamic condition
  private boolean getCondition() {
    return false;
  }
}