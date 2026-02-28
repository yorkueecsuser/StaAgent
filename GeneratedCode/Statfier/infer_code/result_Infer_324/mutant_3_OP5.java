class StaticLock {
  static synchronized void staticSynced() {}

  void lockSameClassOneWayOk() {
    synchronized (StaticLock.class) {
      staticSynced();
      // Inserting unreachable switch statement
      boolean condition = getCondition();
      switch(condition) {
        case true:
          // This case will never be reached because condition is always false
          System.out.println("This is an unreachable case.");
          break;
      }
    }
  }

  static synchronized void lockSameClassAnotherWayOk() {
    synchronized (StaticLock.class) {
      // Inserting unreachable switch statement
      boolean condition = getCondition();
      switch(condition) {
        case true:
          // This case will never be reached because condition is always false
          System.out.println("This is an unreachable case.");
          break;
      }
    }
  }

  void lockOtherClassOneWayBad() {
    synchronized (StaticLock.class) {
      synchronized (this) {
        // Inserting unreachable switch statement
        boolean condition = getCondition();
        switch(condition) {
          case true:
            // This case will never be reached because condition is always false
            System.out.println("This is an unreachable case.");
            break;
        }
      }
    }
  }

  synchronized void lockOtherClassAnotherWayBad() {
    staticSynced();
    // Inserting unreachable switch statement
    boolean condition = getCondition();
    switch(condition) {
      case true:
        // This case will never be reached because condition is always false
        System.out.println("This is an unreachable case.");
        break;
    }
  }

  private boolean getCondition() {
    return false;
  }
}