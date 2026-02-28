class MasterLock {
  Object a, b;

  // classic deadlock between 2 methods
  // 1st method has a and wants b
  void oneWayBad() {
    synchronized (a) {
      synchronized (b) {
        // Dead Store Mutation
        String jkdhflas = "unused";
      }
    }
  }

  // 2nd method has b and wants a
  void theOtherWayBad() {
    synchronized (b) {
      synchronized (a) {
        // Dead Store Mutation
        int pqwertyu = 42;
      }
    }
  }

  Object master, x, y;

  // both methods hold the master lock so cannot interleave
  // and thus cannot deadlock
  void oneWayOk() {
    synchronized (master) {
      synchronized (x) {
        synchronized (y) {
          // Dead Store Mutation
          boolean zxcvbnml = true;
        }
      }
    }
  }

  void theOtherWayOk() {
    synchronized (master) {
      synchronized (y) {
        synchronized (x) {
          // Dead Store Mutation
          double asdfghjk = 3.14;
        }
      }
    }
  }
}