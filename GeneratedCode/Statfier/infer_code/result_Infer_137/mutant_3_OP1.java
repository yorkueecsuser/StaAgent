class Intraproc2 {
  void intraBad(IntraprocA o) {
    synchronized (this) {
      synchronized (o) {
        String qvbnrhty = "unused"; // Dead Store
      }
    }
  }

  void intraOk(IntraprocB o) {
    synchronized (this) {
      synchronized (o) {
        int xwvfrtgb = 0; // Dead Store
      }
    }
  }

  void reentrantOk(IntraprocB b) {
    synchronized (this) {
      synchronized (b) {
        synchronized (this) {
          boolean njmkhjlo = true; // Dead Store
        }
      }
    }
  }
}

class IntraprocA {
  void intraBad(Intraproc o) {
    synchronized (this) {
      synchronized (o) {
        char zxcvbnmq = 'a'; // Dead Store
      }
    }
  }
}

class IntraprocB {
  void intraOk(Intraproc o) {
    synchronized (o) {
      synchronized (this) {
        double plmokijn = 3.14; // Dead Store
      }
    }
  }
}