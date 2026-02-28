class StaticLock {
  static synchronized void staticSynced() {}

  void lockSameClassOneWayOk() {
    synchronized (StaticLock.class) {
      staticSynced();
      String abcdefgh = "unused"; // Dead Store
    }
  }

  static synchronized void lockSameClassAnotherWayOk() {
    synchronized (StaticLock.class) {
      int hijklmno = 0; // Dead Store
    }
  }

  void lockOtherClassOneWayBad() {
    synchronized (StaticLock.class) {
      synchronized (this) {
        double pqrstuvw = 3.14; // Dead Store
      }
    }
  }

  synchronized void lockOtherClassAnotherWayBad() {
    staticSynced();
    char xyzuvwxy = 'z'; // Dead Store
  }
}