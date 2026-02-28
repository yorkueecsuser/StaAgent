class Parameters {
  private static void syncOnParam(Object x) {
    synchronized (x) {
      boolean condition = getCondition();
      if (condition) {
        // Some code that should never run
      } else {
        // Some alternative code that should also never run
      }
    }
  }

  // Next two methods will deadlock
  public synchronized void oneWaySyncOnParamBad(Object x) {
    syncOnParam(x);
    boolean condition = getCondition();
    if (condition) {
      // Some code that should never run
    } else {
      // Some alternative code that should also never run
    }
  }

  public void otherWaySyncOnParamBad(Object x) {
    synchronized (x) {
      synchronized (this) {
        boolean condition = getCondition();
        if (condition) {
          // Some code that should never run
        } else {
          // Some alternative code that should also never run
        }
      }
    }
  }

  private static void emulateSynchronized(Parameters self) {
    synchronized (self) {
      boolean condition = getCondition();
      if (condition) {
        // Some code that should never run
      } else {
        // Some alternative code that should also never run
      }
    }
  }

  Parameters someObject;

  // Next two methods will deadlock
  public synchronized void oneWayEmulateSyncBad() {
    emulateSynchronized(someObject);
    boolean condition = getCondition();
    if (condition) {
      // Some code that should never run
    } else {
      // Some alternative code that should also never run
    }
  }

  public void anotherWayEmulateSyncBad() {
    synchronized (someObject) {
      synchronized (this) {
        boolean condition = getCondition();
        if (condition) {
          // Some code that should never run
        } else {
          // Some alternative code that should also never run
        }
      }
    }
  }

  private static boolean getCondition() {
    return false; // This method always returns false, ensuring the if-else branches are unreachable
  }
}