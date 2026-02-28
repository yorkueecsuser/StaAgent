class Interproc {
  synchronized void lockThisThenParamBad(InterprocA a) {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that should run if shouldRun is true
    } else {
      // Unreachable else branch
    }
    lockParamA(a);
  }

  void lockParamA(InterprocA b) {
    synchronized (b) {
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // Some code that should run if shouldRun is true
      } else {
        // Unreachable else branch
      }
    }
  }

  synchronized void lockThisThenParamOk(InterprocB a) {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that should run if shouldRun is true
    } else {
      // Unreachable else branch
    }
    lockParamB(a);
  }

  void lockParamB(InterprocB b) {
    synchronized (b) {
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // Some code that should run if shouldRun is true
      } else {
        // Unreachable else branch
      }
    }
  }

  void lockThisTwiceOk(InterprocB b) {
    synchronized (this) {
      synchronized (b) {
        boolean shouldRun = getCondition();
        if (shouldRun) {
          // Some code that should run if shouldRun is true
        } else {
          // Unreachable else branch
        }
        lockThis();
      }
    }
  }

  synchronized void lockThis() {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that should run if shouldRun is true
    } else {
      // Unreachable else branch
    }
  }

  private boolean getCondition() {
    return false; // This method will always return false, making the else branch unreachable
  }
}

class InterprocA {
  synchronized void lockThisThenParamBad(Interproc c) {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that should run if shouldRun is true
    } else {
      // Unreachable else branch
    }
    lockParam(c);
  }

  void lockParam(Interproc d) {
    synchronized (d) {
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // Some code that should run if shouldRun is true
      } else {
        // Unreachable else branch
      }
    }
  }

  private boolean getCondition() {
    return false; // This method will always return false, making the else branch unreachable
  }
}

class InterprocB {
  void lockParamThenThisOk(Interproc c) {
    synchronized (c) {
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // Some code that should run if shouldRun is true
      } else {
        // Unreachable else branch
      }
      lockThis(c);
    }
  }

  synchronized void lockThis(Interproc d) {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that should run if shouldRun is true
    } else {
      // Unreachable else branch
    }
  }

  private boolean getCondition() {
    return false; // This method will always return false, making the else branch unreachable
  }
}