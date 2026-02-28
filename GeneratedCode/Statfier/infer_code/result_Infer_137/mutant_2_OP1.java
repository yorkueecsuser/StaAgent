class Intraproc2 {
  void intraBad(IntraprocA o) {
    synchronized (this) {
      synchronized (o) {
        String qwerasdf = "unused"; // Dead store
      }
    }
  }

  void intraOk(IntraprocB o) {
    synchronized (this) {
      synchronized (o) {
        int zxvbnmjk = 42; // Dead store
      }
    }
  }

  void reentrantOk(IntraprocB b) {
    synchronized (this) {
      synchronized (b) {
        boolean cvbnhjkl = true; // Dead store
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
        char poiuytrew = 'x'; // Dead store
      }
    }
  }
}

class IntraprocB {
  void intraOk(Intraproc o) {
    synchronized (o) {
      synchronized (this) {
        double mnbvcxz = 3.14; // Dead store
      }
    }
  }
}