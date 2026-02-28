class Intraproc2 {
  void intraBad(IntraprocA o) {
    synchronized (this) {
      synchronized (o) {
        boolean shouldRun = getCondition();
        if (shouldRun) {
          // Some code that will run if shouldRun is true
        } else {
          // Unreachable code due to shouldRun always being false
        }
      }
    }
  }

  void intraOk(IntraprocB o) {
    synchronized (this) {
      synchronized (o) {
        boolean shouldRun = getCondition();
        if (shouldRun) {
          // Some code that will run if shouldRun is true
        } else {
          // Unreachable code due to shouldRun always being false
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
            // Some code that will run if shouldRun is true
          } else {
            // Unreachable code due to shouldRun always being false
          }
        }
      }
    }
  }

  private boolean getCondition() {
    return false; // This method ensures that the condition is dynamically determined but always false
  }
}

class IntraprocA {
  void intraBad(Intraproc o) {
    synchronized (this) {
      synchronized (o) {
        boolean shouldRun = getCondition();
        if (shouldRun) {
          // Some code that will run if shouldRun is true
        } else {
          // Unreachable code due to shouldRun always being false
        }
      }
    }
  }

  private boolean getCondition() {
    return false; // This method ensures that the condition is dynamically determined but always false
  }
}

class IntraprocB {
  void intraOk(Intraproc o) {
    synchronized (o) {
      synchronized (this) {
        boolean shouldRun = getCondition();
        if (shouldRun) {
          // Some code that will run if shouldRun is true
        } else {
          // Unreachable code due to shouldRun always being false
        }
      }
    }
  }

  private boolean getCondition() {
    return false; // This method ensures that the condition is dynamically determined but always false
  }
}