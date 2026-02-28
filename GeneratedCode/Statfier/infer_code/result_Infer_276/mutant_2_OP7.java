class Parameters {
  private static void syncOnParam(Object x) {
    synchronized (x) {
      boolean conditionWhile = getCondition();
      while (conditionWhile) {
        // Unreachable code
      }
    }
  }

  // Next two methods will deadlock
  public synchronized void oneWaySyncOnParamBad(Object x) {
    syncOnParam(x);
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
  }

  public void otherWaySyncOnParamBad(Object x) {
    synchronized (x) {
      synchronized (this) {
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
          // Unreachable code
        }
      }
    }
  }

  private static void emulateSynchronized(Parameters self) {
    synchronized (self) {
      boolean conditionWhile = getCondition();
      while (conditionWhile) {
        // Unreachable code
      }
    }
  }

  Parameters someObject;

  // Next two methods will deadlock
  public synchronized void oneWayEmulateSyncBad() {
    emulateSynchronized(someObject);
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
  }

  public void anotherWayEmulateSyncBad() {
    synchronized (someObject) {
      synchronized (this) {
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
          // Unreachable code
        }
      }
    }
  }

  private static boolean getCondition() {
    return false;
  }
}