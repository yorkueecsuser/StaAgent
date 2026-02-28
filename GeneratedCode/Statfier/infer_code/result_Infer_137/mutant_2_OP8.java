class Intraproc2 {
  void intraBad(IntraprocA o) {
    synchronized (this) {
      synchronized (o) {
      }
    }
  }

  void intraOk(IntraprocB x) { // Mutated variable name from 'o' to 'x'
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
  void intraBad(Intraproc y) { // Mutated variable name from 'o' to 'y'
    synchronized (this) {
      synchronized (y) {
      }
    }
  }
}

class IntraprocB {
  void intraOk(Intraproc z) { // Mutated variable name from 'o' to 'z'
    synchronized (z) {
      synchronized (this) {
      }
    }
  }
}