class Parameters {
  private static void syncOnParam(Object x) {
    synchronized (x) {
      boolean conditionWhile = getCondition();
      while (conditionWhile) {
        // Unreachable while loop
      }
    }
  }

  // Next two methods will deadlock
  public synchronized void oneWaySyncOnParamBad(Object x) {
    syncOnParam(x);
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
    }
  }

  public void otherWaySyncOnParamBad(Object x) {
    synchronized (x) {
      synchronized (this) {
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
          // Unreachable while loop
        }
      }
    }
  }

  private static void emulateSynchronized(Parameters self) {
    synchronized (self) {
      boolean conditionWhile = getCondition();
      while (conditionWhile) {
        // Unreachable while loop
      }
    }
  }

  Parameters someObject;

  // Next two methods will deadlock
  public synchronized void oneWayEmulateSyncBad() {
    emulateSynchronized(someObject);
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
    }
  }

  public void anotherWayEmulateSyncBad() {
    synchronized (someObject) {
      synchronized (this) {
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
          // Unreachable while loop
        }
      }
    }
  }

  private static boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined at runtime
  }
}