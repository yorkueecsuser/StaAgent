class Parameters {
  private static void syncOnParam(Object x) {
    synchronized (x) {
      boolean condition = getCondition();
      if (condition) {
        // Unreachable code
      }
    }
  }

  // Next two methods will deadlock
  public synchronized void oneWaySyncOnParamBad(Object x) {
    syncOnParam(x);
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
    }
  }

  public void otherWaySyncOnParamBad(Object x) {
    synchronized (x) {
      synchronized (this) {
        boolean condition = getCondition();
        if (condition) {
          // Unreachable code
        }
      }
    }
  }

  private static void emulateSynchronized(Parameters self) {
    synchronized (self) {
      boolean condition = getCondition();
      if (condition) {
        // Unreachable code
      }
    }
  }

  Parameters someObject;

  // Next two methods will deadlock
  public synchronized void oneWayEmulateSyncBad() {
    emulateSynchronized(someObject);
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
    }
  }

  public void anotherWayEmulateSyncBad() {
    synchronized (someObject) {
      synchronized (this) {
        boolean condition = getCondition();
        if (condition) {
          // Unreachable code
        }
      }
    }
  }

  private static boolean getCondition() {
    return false; // This method always returns false, ensuring the if block is unreachable
  }
}