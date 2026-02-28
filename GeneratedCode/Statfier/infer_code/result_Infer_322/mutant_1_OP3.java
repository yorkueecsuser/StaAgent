class Intraproc {
  void intraBad(IntraprocA o) {
    synchronized (this) {
      synchronized (o) {
        boolean condition = getCondition();
        if (condition) {
          // unreachable code
        }
      }
    }
  }

  void intraOk(IntraprocB o) {
    synchronized (this) {
      synchronized (o) {
        boolean condition = getCondition();
        if (condition) {
          // unreachable code
        }
      }
    }
  }

  void reentrantOk(IntraprocB b) {
    synchronized (this) {
      synchronized (b) {
        synchronized (this) {
          boolean condition = getCondition();
          if (condition) {
            // unreachable code
          }
        }
      }
    }
  }

  private boolean getCondition() {
    return false;
  }
}

class IntraprocA {
  void intraBad(Intraproc o) {
    synchronized (this) {
      synchronized (o) {
        boolean condition = getCondition();
        if (condition) {
          // unreachable code
        }
      }
    }
  }

  private boolean getCondition() {
    return false;
  }
}

class IntraprocB {
  void intraOk(Intraproc o) {
    synchronized (o) {
      synchronized (this) {
        boolean condition = getCondition();
        if (condition) {
          // unreachable code
        }
      }
    }
  }

  private boolean getCondition() {
    return false;
  }
}