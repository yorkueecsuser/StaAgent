class Intraproc {
  void intraBad(IntraprocA o) {
    synchronized (this) {
      synchronized (o) {
      }
    }
  }

  void intraOk(IntraprocB o) {
    synchronized (this) {
      synchronized (o) {
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

  // Mutated code
  void reentrantOk(IntraprocB x) {
    synchronized (this) {
      synchronized (x) {
        synchronized (this) {
        }
      }
    }
  }
}

class IntraprocA {
  void intraBad(Intraproc o) {
    synchronized (this) {
      synchronized (o) {
      }
    }
  }

  // Mutated code
  void intraBad(Intraproc q) {
    synchronized (this) {
      synchronized (q) {
      }
    }
  }
}

class IntraprocB {
  void intraOk(Intraproc o) {
    synchronized (o) {
      synchronized (this) {
      }
    }
  }

  // Mutated code
  void intraOk(Intraproc p) {
    synchronized (p) {
      synchronized (this) {
      }
    }
  }
}