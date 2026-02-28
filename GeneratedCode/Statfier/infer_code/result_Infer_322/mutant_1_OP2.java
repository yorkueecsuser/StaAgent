class Intraproc {
  void intraBad(IntraprocA o) {
    int x = 1; // Hypothetical assignment statement for demonstration
    int x_duplicate = 1; // Duplicate of the above assignment statement
    synchronized (this) {
      synchronized (o) {
        int y = 2; // Another hypothetical assignment statement for demonstration
        int y_duplicate = 2; // Duplicate of the above assignment statement
      }
    }
  }

  void intraOk(IntraprocB o) {
    int a = 3; // Hypothetical assignment statement for demonstration
    int a_duplicate = 3; // Duplicate of the above assignment statement
    synchronized (this) {
      synchronized (o) {
        int b = 4; // Another hypothetical assignment statement for demonstration
        int b_duplicate = 4; // Duplicate of the above assignment statement
      }
    }
  }

  void reentrantOk(IntraprocB b) {
    int c = 5; // Hypothetical assignment statement for demonstration
    int c_duplicate = 5; // Duplicate of the above assignment statement
    synchronized (this) {
      synchronized (b) {
        int d = 6; // Another hypothetical assignment statement for demonstration
        int d_duplicate = 6; // Duplicate of the above assignment statement
        synchronized (this) {
          int e = 7; // Another hypothetical assignment statement for demonstration
          int e_duplicate = 7; // Duplicate of the above assignment statement
        }
      }
    }
  }
}

class IntraprocA {
  void intraBad(Intraproc o) {
    int f = 8; // Hypothetical assignment statement for demonstration
    int f_duplicate = 8; // Duplicate of the above assignment statement
    synchronized (this) {
      synchronized (o) {
        int g = 9; // Another hypothetical assignment statement for demonstration
        int g_duplicate = 9; // Duplicate of the above assignment statement
      }
    }
  }
}

class IntraprocB {
  void intraOk(Intraproc o) {
    int h = 10; // Hypothetical assignment statement for demonstration
    int h_duplicate = 10; // Duplicate of the above assignment statement
    synchronized (o) {
      synchronized (this) {
        int i = 11; // Another hypothetical assignment statement for demonstration
        int i_duplicate = 11; // Duplicate of the above assignment statement
      }
    }
  }
}