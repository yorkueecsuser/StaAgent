class MasterLock {
  Object a, b;

  // classic deadlock between 2 methods
  // 1st method has a and wants b
  void oneWayBad() {
    synchronized (a) {
      synchronized (b) {
      }
    }
  }

  // 2nd method has b and wants a
  void theOtherWayBad() {
    synchronized (b) {
      synchronized (a) {
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
        }
      }
    }
  }

  void theOtherWayOk() {
    synchronized (master) {
      synchronized (y) {
        synchronized (x) {
        }
      }
    }
  }

  // Mutated code
  Object c, d;

  // classic deadlock between 2 methods
  // 1st method has c and wants d
  void oneWayBadMutant() {
    synchronized (c) {
      synchronized (d) {
      }
    }
  }

  // 2nd method has d and wants c
  void theOtherWayBadMutant() {
    synchronized (d) {
      synchronized (c) {
      }
    }
  }

  Object e, f, g;

  // both methods hold the master lock so cannot interleave
  // and thus cannot deadlock
  void oneWayOkMutant() {
    synchronized (e) {
      synchronized (f) {
        synchronized (g) {
        }
      }
    }
  }

  void theOtherWayOkMutant() {
    synchronized (e) {
      synchronized (g) {
        synchronized (f) {
        }
      }
    }
  }
}