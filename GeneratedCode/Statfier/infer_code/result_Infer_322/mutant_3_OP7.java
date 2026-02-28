class Intraproc {
  void intraBad(IntraprocA o) {
    synchronized (this) {
      synchronized (o) {
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
          // Unreachable code
        }
      }
    }
  }

  void intraOk(IntraprocB o) {
    synchronized (this) {
      synchronized (o) {
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
          // Unreachable code
        }
      }
    }
  }

  void reentrantOk(IntraprocB b) {
    synchronized (this) {
      synchronized (b) {
        synchronized (this) {
          boolean conditionWhile = getCondition();
          while (conditionWhile) {
            // Unreachable code
          }
        }
      }
    }
  }

  private boolean getCondition() {
    return false; // This method always returns false, making the while loop unreachable
  }
}

class IntraprocA {
  void intraBad(Intraproc o) {
    synchronized (this) {
      synchronized (o) {
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
          // Unreachable code
        }
      }
    }
  }

  private boolean getCondition() {
    return false; // This method always returns false, making the while loop unreachable
  }
}

class IntraprocB {
  void intraOk(Intraproc o) {
    synchronized (o) {
      synchronized (this) {
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
          // Unreachable code
        }
      }
    }
  }

  private boolean getCondition() {
    return false; // This method always returns false, making the while loop unreachable
  }
}