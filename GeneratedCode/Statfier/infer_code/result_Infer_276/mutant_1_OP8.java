class Parameters {
  private static void syncOnParam(Object x) {
    synchronized (x) {
    }
  }

  // Next two methods will deadlock
  public synchronized void oneWaySyncOnParamBad(Object x) {
    syncOnParam(x);
  }

  public void otherWaySyncOnParamBad(Object x) {
    synchronized (x) {
      synchronized (this) {
      }
    }
  }

  private static void emulateSynchronized(Parameters self) {
    synchronized (self) {
    }
  }

  Parameters someObject;

  // Next two methods will deadlock
  public synchronized void oneWayEmulateSyncBad() {
    emulateSynchronized(someObject);
  }

  public void anotherWayEmulateSyncBad() {
    synchronized (someObject) {
      synchronized (this) {
      }
    }
  }

  // Mutated code
  private static void syncOnParam(a y) {
    synchronized (y) {
    }
  }

  // Next two methods will deadlock
  public synchronized void oneWaySyncOnParamBad(a y) {
    syncOnParam(y);
  }

  public void otherWaySyncOnParamBad(a y) {
    synchronized (y) {
      synchronized (this) {
      }
    }
  }

  private static void emulateSynchronized(b c) {
    synchronized (c) {
    }
  }

  b d;

  // Next two methods will deadlock
  public synchronized void oneWayEmulateSyncBad() {
    emulateSynchronized(d);
  }

  public void anotherWayEmulateSyncBad() {
    synchronized (d) {
      synchronized (this) {
      }
    }
  }
}