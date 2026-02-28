class Intraproc2 {
  void intraBad(IntraprocA o) {
    synchronized (this) {
      synchronized (o) {
        boolean shouldRun = getCondition();
        if (shouldRun) {
          // Some code
        } else {
          // Unreachable code
        }
      }
    }
  }

  void intraOk(IntraprocB o) {
    synchronized (this) {
      synchronized (o) {
        boolean shouldRun = getCondition();
        if (shouldRun) {
          // Some code
        } else {
          // Unreachable code
        }
      }
    }
  }

  void reentrantOk(IntraprocB b) {
    synchronized (this) {
      synchronized (b) {
        synchronized (this) {
          boolean shouldRun = getCondition();
          if (shouldRun) {
            // Some code
          } else {
            // Unreachable code
          }
        }
      }
    }
  }

  private boolean getCondition() {
    return false; // This method always returns false, making the else block unreachable at runtime
  }
}

class IntraprocA {
  void intraBad(Intraproc o) {
    synchronized (this) {
      synchronized (o) {
        boolean shouldRun = getCondition();
        if (shouldRun) {
          // Some code
        } else {
          // Unreachable code
        }
      }
    }
  }

  private boolean getCondition() {
    return false; // This method always returns false, making the else block unreachable at runtime
  }
}

class IntraprocB {
  void intraOk(Intraproc o) {
    synchronized (o) {
      synchronized (this) {
        boolean shouldRun = getCondition();
        if (shouldRun) {
          // Some code
        } else {
          // Unreachable code
        }
      }
    }
  }

  private boolean getCondition() {
    return false; // This method always returns false, making the else block unreachable at runtime
  }
}