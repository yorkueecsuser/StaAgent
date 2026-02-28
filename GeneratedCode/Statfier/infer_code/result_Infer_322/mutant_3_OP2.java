class Intraproc {
  void intraBad(IntraprocA o) {
    synchronized (this) {
      synchronized (o) {
        int temp = 0; // Unique assignment for mutation
        int tempCopy = temp; // Duplicate of the above assignment
      }
    }
  }

  void intraOk(IntraprocB o) {
    synchronized (this) {
      synchronized (o) {
        int temp = 1; // Unique assignment for mutation
        int tempCopy = temp; // Duplicate of the above assignment
      }
    }
  }

  void reentrantOk(IntraprocB b) {
    synchronized (this) {
      synchronized (b) {
        int temp = 2; // Unique assignment for mutation
        int tempCopy = temp; // Duplicate of the above assignment
        synchronized (this) {
          int innerTemp = 3; // Unique assignment for mutation
          int innerTempCopy = innerTemp; // Duplicate of the above assignment
        }
      }
    }
  }
}

class IntraprocA {
  void intraBad(Intraproc o) {
    synchronized (this) {
      synchronized (o) {
        int temp = 4; // Unique assignment for mutation
        int tempCopy = temp; // Duplicate of the above assignment
      }
    }
  }
}

class IntraprocB {
  void intraOk(Intraproc o) {
    synchronized (o) {
      synchronized (this) {
        int temp = 5; // Unique assignment for mutation
        int tempCopy = temp; // Duplicate of the above assignment
      }
    }
  }
}