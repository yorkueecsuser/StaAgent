class Intraproc2 {
  void intraBad(IntraprocA o) {
    int temp = 0; // Hypothetical assignment for demonstration
    int temp2 = temp; // Duplicated assignment
    synchronized (this) {
      synchronized (o) {
        int innerTemp = 1; // Hypothetical assignment for demonstration
        int innerTemp2 = innerTemp; // Duplicated assignment
      }
    }
  }

  void intraOk(IntraprocB o) {
    int temp = 0; // Hypothetical assignment for demonstration
    int temp2 = temp; // Duplicated assignment
    synchronized (this) {
      synchronized (o) {
        int innerTemp = 1; // Hypothetical assignment for demonstration
        int innerTemp2 = innerTemp; // Duplicated assignment
      }
    }
  }

  void reentrantOk(IntraprocB b) {
    int temp = 0; // Hypothetical assignment for demonstration
    int temp2 = temp; // Duplicated assignment
    synchronized (this) {
      synchronized (b) {
        int innerTemp = 1; // Hypothetical assignment for demonstration
        int innerTemp2 = innerTemp; // Duplicated assignment
        synchronized (this) {
          int innerInnerTemp = 2; // Hypothetical assignment for demonstration
          int innerInnerTemp2 = innerInnerTemp; // Duplicated assignment
        }
      }
    }
  }
}

class IntraprocA {
  void intraBad(Intraproc o) {
    int temp = 0; // Hypothetical assignment for demonstration
    int temp2 = temp; // Duplicated assignment
    synchronized (this) {
      synchronized (o) {
        int innerTemp = 1; // Hypothetical assignment for demonstration
        int innerTemp2 = innerTemp; // Duplicated assignment
      }
    }
  }
}

class IntraprocB {
  void intraOk(Intraproc o) {
    int temp = 0; // Hypothetical assignment for demonstration
    int temp2 = temp; // Duplicated assignment
    synchronized (o) {
      synchronized (this) {
        int innerTemp = 1; // Hypothetical assignment for demonstration
        int innerTemp2 = innerTemp; // Duplicated assignment
      }
    }
  }
}