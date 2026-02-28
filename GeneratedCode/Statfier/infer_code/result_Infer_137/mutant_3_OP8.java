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
  void intraBad(Intraproc y) {
    synchronized (this) {
      synchronized (y) {
      }
    }
  }
}

class IntraprocB {
  void intraOk(Intraproc z) {
    synchronized (z) {
      synchronized (this) {
      }
    }
  }
}