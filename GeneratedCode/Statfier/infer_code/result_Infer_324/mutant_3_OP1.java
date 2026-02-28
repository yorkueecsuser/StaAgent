class StaticLock {
  static synchronized void staticSynced() {
    String qwejklfn = "unused"; // Dead Store mutation
  }

  void lockSameClassOneWayOk() {
    synchronized (StaticLock.class) {
      staticSynced();
      int abcd1234 = 0; // Dead Store mutation
    }
  }

  static synchronized void lockSameClassAnotherWayOk() {
    synchronized (StaticLock.class) {
      double xyz789 = 3.14; // Dead Store mutation
    }
  }

  void lockOtherClassOneWayBad() {
    synchronized (StaticLock.class) {
      synchronized (this) {
        boolean ghijklop = true; // Dead Store mutation
      }
    }
  }

  synchronized void lockOtherClassAnotherWayBad() {
    staticSynced();
    char rstuvqaz = 'a'; // Dead Store mutation
  }
}