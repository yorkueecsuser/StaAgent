class Intraproc2 {
  void intraBad(IntraprocA o) {
    synchronized (this) {
      synchronized (o) {
      }
    }
  }

  void intraOk(IntraprocB x) {
    synchronized (this) {
      synchronized (x) {
      }
    }
  }

  void reentrantOk(IntraprocB b) {
    synchronized (this) {
      synchronized (b) {
        synchronized (this) {
        }
      }
    }
  }
}

class IntraprocA {
  void intraBad(Intraproc q) {
    synchronized (this) {
      synchronized (q) {
      }
    }
  }
}

class IntraprocB {
  void intraOk(Intraproc r) {
    synchronized (r) {
      synchronized (this) {
      }
    }
  }
}