class Parameters {
  private static void syncOnParam(Object x) {
    synchronized (x) {
      String jkdhfzcv = "unused"; // Dead Store mutation
    }
  }

  // Next two methods will deadlock
  public synchronized void oneWaySyncOnParamBad(Object x) {
    syncOnParam(x);
    int pqwertyu = 42; // Dead Store mutation
  }

  public void otherWaySyncOnParamBad(Object x) {
    synchronized (x) {
      synchronized (this) {
        boolean abcdefgh = true; // Dead Store mutation
      }
    }
  }

  private static void emulateSynchronized(Parameters self) {
    synchronized (self) {
      double xyzuvwxy = 3.14; // Dead Store mutation
    }
  }

  Parameters someObject;

  // Next two methods will deadlock
  public synchronized void oneWayEmulateSyncBad() {
    emulateSynchronized(someObject);
    char rstuvxyz = 'a'; // Dead Store mutation
  }

  public void anotherWayEmulateSyncBad() {
    synchronized (someObject) {
      synchronized (this) {
        long mnopqrst = 123456789L; // Dead Store mutation
      }
    }
  }
}