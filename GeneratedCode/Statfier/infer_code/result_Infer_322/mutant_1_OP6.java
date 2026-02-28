class Intraproc {
  void intraBad(IntraprocA o) {
    synchronized (this) {
      synchronized (o) {
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
          // Unreachable loop body
        }
      }
    }
  }

  void intraOk(IntraprocB o) {
    synchronized (this) {
      synchronized (o) {
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
          // Unreachable loop body
        }
      }
    }
  }

  void reentrantOk(IntraprocB b) {
    synchronized (this) {
      synchronized (b) {
        synchronized (this) {
          boolean conditionFor = getCondition();
          for (int i = 0; conditionFor; i++) {
            // Unreachable loop body
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
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
          // Unreachable loop body
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
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
          // Unreachable loop body
        }
      }
    }
  }

  private boolean getCondition() {
    return false;
  }
}