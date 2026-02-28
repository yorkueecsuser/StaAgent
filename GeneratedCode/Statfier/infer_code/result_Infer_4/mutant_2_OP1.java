class MasterLock {
  Object a, b;

  // classic deadlock between 2 methods
  // 1st method has a and wants b
  void oneWayBad() {
    synchronized (a) {
      synchronized (b) {
        String qjvbnrht = "unused"; // Dead store mutation
      }
    }
  }

  // 2nd method has b and wants a
  void theOtherWayBad() {
    synchronized (b) {
      synchronized (a) {
        int mfnbvdzx = 42; // Dead store mutation
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
          boolean kxqjwvft = true; // Dead store mutation
        }
      }
    }
  }

  void theOtherWayOk() {
    synchronized (master) {
      synchronized (y) {
        synchronized (x) {
          char zvqjwvft = 'a'; // Dead store mutation
        }
      }
    }
  }
}