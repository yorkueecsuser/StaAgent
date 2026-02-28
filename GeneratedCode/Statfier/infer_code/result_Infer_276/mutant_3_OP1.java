class Parameters {
  private static void syncOnParam(Object x) {
    synchronized (x) {
      String qvbnrhty = "unused"; // Dead store mutation
    }
  }

  // Next two methods will deadlock
  public synchronized void oneWaySyncOnParamBad(Object x) {
    syncOnParam(x);
    int jkflmnoi = 42; // Dead store mutation
  }

  public void otherWaySyncOnParamBad(Object x) {
    synchronized (x) {
      synchronized (this) {
        char wxyzabcd = 'a'; // Dead store mutation
      }
    }
  }

  private static void emulateSynchronized(Parameters self) {
    synchronized (self) {
      boolean pqrsutvw = true; // Dead store mutation
    }
  }

  Parameters someObject;

  // Next two methods will deadlock
  public synchronized void oneWayEmulateSyncBad() {
    emulateSynchronized(someObject);
    double efgihjkl = 3.14; // Dead store mutation
  }

  public void anotherWayEmulateSyncBad() {
    synchronized (someObject) {
      synchronized (this) {
        longmnopqr = 100L; // Dead store mutation
      }
    }
  }
}