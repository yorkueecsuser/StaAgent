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

  // Mutated code starts here

  private static void syncOnParam(Object a) {
    synchronized (a) {
    }
  }

  // Next two methods will deadlock
  public synchronized void oneWaySyncOnParamBad(Object b) {
    syncOnParam(b);
  }

  public void otherWaySyncOnParamBad(Object c) {
    synchronized (c) {
      synchronized (this) {
      }
    }
  }

  private static void emulateSynchronized(Parameters d) {
    synchronized (d) {
    }
  }

  Parameters e;

  // Next two methods will deadlock
  public synchronized void oneWayEmulateSyncBad() {
    emulateSynchronized(e);
  }

  public void anotherWayEmulateSyncBad() {
    synchronized (e) {
      synchronized (this) {
      }
    }
  }
}