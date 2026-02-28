class Intraproc {
  void intraBad(IntraprocA o) {
    synchronized (this) {
      synchronized (o) {
        boolean shouldRun = getCondition();
        if (shouldRun) {
          // Some code that should never run
        } else {
          // Some alternative code that should also never run
        }
      }
    }
  }

  void intraOk(IntraprocB o) {
    synchronized (this) {
      synchronized (o) {
        boolean shouldRun = getCondition();
        if (shouldRun) {
          // Some code that should never run
        } else {
          // Some alternative code that should also never run
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
            // Some code that should never run
          } else {
            // Some alternative code that should also never run
          }
        }
      }
    }
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined but always false
  }
}

class IntraprocA {
  void intraBad(Intraproc o) {
    synchronized (this) {
      synchronized (o) {
        boolean shouldRun = getCondition();
        if (shouldRun) {
          // Some code that should never run
        } else {
          // Some alternative code that should also never run
        }
      }
    }
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined but always false
  }
}

class IntraprocB {
  void intraOk(Intraproc o) {
    synchronized (o) {
      synchronized (this) {
        boolean shouldRun = getCondition();
        if (shouldRun) {
          // Some code that should never run
        } else {
          // Some alternative code that should also never run
        }
      }
    }
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined but always false
  }
}