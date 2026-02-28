class Intraproc2 {
  void intraBad(IntraprocA o) {
    int x = 0; // Introduced for mutation
    int y = 1; // Introduced for mutation
    synchronized (this) {
      synchronized (o) {
        x = y; // Assignment statement for mutation
        x = y; // Duplicate of the assignment statement
      }
    }
  }

  void intraOk(IntraprocB o) {
    int a = 0; // Introduced for mutation
    int b = 1; // Introduced for mutation
    synchronized (this) {
      synchronized (o) {
        a = b; // Assignment statement for mutation
        a = b; // Duplicate of the assignment statement
      }
    }
  }

  void reentrantOk(IntraprocB b) {
    int m = 0; // Introduced for mutation
    int n = 1; // Introduced for mutation
    synchronized (this) {
      synchronized (b) {
        synchronized (this) {
          m = n; // Assignment statement for mutation
          m = n; // Duplicate of the assignment statement
        }
      }
    }
  }
}

class IntraprocA {
  void intraBad(Intraproc o) {
    int p = 0; // Introduced for mutation
    int q = 1; // Introduced for mutation
    synchronized (this) {
      synchronized (o) {
        p = q; // Assignment statement for mutation
        p = q; // Duplicate of the assignment statement
      }
    }
  }
}

class IntraprocB {
  void intraOk(Intraproc o) {
    int r = 0; // Introduced for mutation
    int s = 1; // Introduced for mutation
    synchronized (o) {
      synchronized (this) {
        r = s; // Assignment statement for mutation
        r = s; // Duplicate of the assignment statement
      }
    }
  }
}