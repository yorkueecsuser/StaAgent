class Parameters {
  private static void syncOnParam(Object x) {
    synchronized (x) {
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // Some code that should run if condition is true
      } else {
        // Unreachable code due to false condition
      }
    }
  }

  // Next two methods will deadlock
  public synchronized void oneWaySyncOnParamBad(Object x) {
    syncOnParam(x);
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that should run if condition is true
    } else {
      // Unreachable code due to false condition
    }
  }

  public void otherWaySyncOnParamBad(Object x) {
    synchronized (x) {
      synchronized (this) {
        boolean shouldRun = getCondition();
        if (shouldRun) {
          // Some code that should run if condition is true
        } else {
          // Unreachable code due to false condition
        }
      }
    }
  }

  private static void emulateSynchronized(Parameters self) {
    synchronized (self) {
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // Some code that should run if condition is true
      } else {
        // Unreachable code due to false condition
      }
    }
  }

  Parameters someObject;

  // Next two methods will deadlock
  public synchronized void oneWayEmulateSyncBad() {
    emulateSynchronized(someObject);
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that should run if condition is true
    } else {
      // Unreachable code due to false condition
    }
  }

  public void anotherWayEmulateSyncBad() {
    synchronized (someObject) {
      synchronized (this) {
        boolean shouldRun = getCondition();
        if (shouldRun) {
          // Some code that should run if condition is true
        } else {
          // Unreachable code due to false condition
        }
      }
    }
  }

  private static boolean getCondition() {
    return false; // This method always returns false, making the else block unreachable
  }
}