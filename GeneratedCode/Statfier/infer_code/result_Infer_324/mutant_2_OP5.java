class StaticLock {
  static synchronized void staticSynced() {}

  void lockSameClassOneWayOk() {
    synchronized (StaticLock.class) {
      staticSynced();
      // Introduced unreachable switch statement
      boolean condition = getCondition();
      switch(condition) {
        case true:
          // This case will never be reached because condition is never set to true
          System.out.println("This is unreachable");
          break;
      }
    }
  }

  static synchronized void lockSameClassAnotherWayOk() {
    synchronized (StaticLock.class) {
      // Introduced unreachable switch statement
      boolean condition = getCondition();
      switch(condition) {
        case true:
          // This case will never be reached because condition is never set to true
          System.out.println("This is unreachable");
          break;
      }
    }
  }

  void lockOtherClassOneWayBad() {
    synchronized (StaticLock.class) {
      synchronized (this) {
        // Introduced unreachable switch statement
        boolean condition = getCondition();
        switch(condition) {
          case true:
            // This case will never be reached because condition is never set to true
            System.out.println("This is unreachable");
            break;
        }
      }
    }
  }

  synchronized void lockOtherClassAnotherWayBad() {
    staticSynced();
    // Introduced unreachable switch statement
    boolean condition = getCondition();
    switch(condition) {
      case true:
        // This case will never be reached because condition is never set to true
        System.out.println("This is unreachable");
        break;
    }
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is always false
  }
}