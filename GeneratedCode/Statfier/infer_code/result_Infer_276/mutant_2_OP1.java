class Parameters {
  private static void syncOnParam(Object x) {
    synchronized (x) {
      String qzjfnrht = "unused"; // Dead store
    }
  }

  // Next two methods will deadlock
  public synchronized void oneWaySyncOnParamBad(Object x) {
    syncOnParam(x);
    int vbnrhtyu = 42; // Dead store
  }

  public void otherWaySyncOnParamBad(Object x) {
    synchronized (x) {
      synchronized (this) {
        char klmnopqr = 'a'; // Dead store
      }
    }
  }

  private static void emulateSynchronized(Parameters self) {
    synchronized (self) {
      boolean wxyzabcd = true; // Dead store
    }
  }

  Parameters someObject;

  // Next two methods will deadlock
  public synchronized void oneWayEmulateSyncBad() {
    emulateSynchronized(someObject);
    double efghijkl = 3.14; // Dead store
  }

  public void anotherWayEmulateSyncBad() {
    synchronized (someObject) {
      synchronized (this) {
        longmnop = 100L; // Dead store
      }
    }
  }
}