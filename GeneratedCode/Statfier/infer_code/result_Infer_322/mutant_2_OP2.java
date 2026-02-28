class Intraproc {
  void intraBad(IntraprocA o) {
    synchronized (this) {
      synchronized (o) {
      }
      // Mutant: Duplicate the inner synchronized block
      synchronized (o) {
      }
    }
  }

  void intraOk(IntraprocB o) {
    synchronized (this) {
      synchronized (o) {
      }
      // Mutant: Duplicate the inner synchronized block
      synchronized (o) {
      }
    }
  }

  void reentrantOk(IntraprocB b) {
    synchronized (this) {
      synchronized (b) {
        synchronized (this) {
        }
        // Mutant: Duplicate the innermost synchronized block
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
      // Mutant: Duplicate the inner synchronized block
      synchronized (o) {
      }
    }
  }
}

class IntraprocB {
  void intraOk(Intraproc o) {
    synchronized (o) {
      synchronized (this) {
      }
      // Mutant: Duplicate the inner synchronized block
      synchronized (this) {
      }
    }
  }
}