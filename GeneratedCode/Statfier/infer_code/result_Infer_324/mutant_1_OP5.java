class StaticLock {
  static synchronized void staticSynced() {}

  void lockSameClassOneWayOk() {
    synchronized (StaticLock.class) {
      staticSynced();
      // Mutant code start
      boolean condition = getCondition();
      switch(condition) {
        case true:
          // This case is reachable but does nothing
          break;
        default:
          // This default case is unreachable because condition is never false
          System.out.println("This is an unreachable switch case");
          break;
      }
      // Mutant code end
    }
  }

  static synchronized void lockSameClassAnotherWayOk() {
    synchronized (StaticLock.class) {
      // Mutant code start
      boolean condition = getCondition();
      switch(condition) {
        case true:
          // This case is reachable but does nothing
          break;
        default:
          // This default case is unreachable because condition is never false
          System.out.println("This is an unreachable switch case");
          break;
      }
      // Mutant code end
    }
  }

  void lockOtherClassOneWayBad() {
    synchronized (StaticLock.class) {
      synchronized (this) {
        // Mutant code start
        boolean condition = getCondition();
        switch(condition) {
          case true:
            // This case is reachable but does nothing
            break;
          default:
            // This default case is unreachable because condition is never false
            System.out.println("This is an unreachable switch case");
            break;
        }
        // Mutant code end
      }
    }
  }

  synchronized void lockOtherClassAnotherWayBad() {
    staticSynced();
    // Mutant code start
    boolean condition = getCondition();
    switch(condition) {
      case true:
        // This case is reachable but does nothing
        break;
      default:
        // This default case is unreachable because condition is never false
        System.out.println("This is an unreachable switch case");
        break;
    }
    // Mutant code end
  }

  // Helper method to provide a dynamic condition
  private boolean getCondition() {
    return true; // Always returns true to ensure the default case is unreachable
  }
}