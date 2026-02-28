class Intraproc2 {
  void intraBad(IntraprocA o) {
    synchronized (this) {
      synchronized (o) {
      }
      synchronized (o) { // Duplicate
      }
    }
  }

  void intraOk(IntraprocB o) {
    synchronized (this) {
      synchronized (o) {
      }
      synchronized (o) { // Duplicate
      }
    }
  }

  void reentrantOk(IntraprocB b) {
    synchronized (this) {
      synchronized (b) {
        synchronized (this) {
        }
        synchronized (this) { // Duplicate
        }
      }
      synchronized (b) { // Duplicate
      }
    }
  }
}

class IntraprocA {
  void intraBad(Intraproc o) {
    synchronized (this) {
      synchronized (o) {
      }
      synchronized (o) { // Duplicate
      }
    }
  }
}

class IntraprocB {
  void intraOk(Intraproc o) {
    synchronized (o) {
      synchronized (this) {
      }
      synchronized (this) { // Duplicate
      }
    }
    synchronized (o) { // Duplicate
    }
  }
}