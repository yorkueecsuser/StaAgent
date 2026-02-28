class MasterLock {
  Object a, b;

  // classic deadlock between 2 methods
  // 1st method has a and wants b
  void oneWayBad() {
    synchronized (a) {
      synchronized (b) {
        // Inserting unreachable for loop
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
          // Unreachable code
        }
      }
    }
  }

  // 2nd method has b and wants a
  void theOtherWayBad() {
    synchronized (b) {
      synchronized (a) {
        // Inserting unreachable for loop
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
          // Unreachable code
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
          // Inserting unreachable for loop
          boolean conditionFor = getCondition();
          for (int i = 0; conditionFor; i++) {
            // Unreachable code
          }
        }
      }
    }
  }

  void theOtherWayOk() {
    synchronized (master) {
      synchronized (y) {
        synchronized (x) {
          // Inserting unreachable for loop
          boolean conditionFor = getCondition();
          for (int i = 0; conditionFor; i++) {
            // Unreachable code
          }
        }
      }
    }
  }

  // Method to provide a dynamic condition for the for loop
  private boolean getCondition() {
    return false;
  }
}