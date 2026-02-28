class Interproc {
  synchronized void lockThisThenParamBad(InterprocA a) {
    boolean condition = getCondition();
    if (condition) {
      // Some code that might be executed if condition is true
    } else {
      // Unreachable else branch
    }
    lockParamA(a);
  }

  void lockParamA(InterprocA b) {
    synchronized (b) {
      boolean condition = getCondition();
      if (condition) {
        // Some code that might be executed if condition is true
      } else {
        // Unreachable else branch
      }
    }
  }

  synchronized void lockThisThenParamOk(InterprocB a) {
    boolean condition = getCondition();
    if (condition) {
      // Some code that might be executed if condition is true
    } else {
      // Unreachable else branch
    }
    lockParamB(a);
  }

  void lockParamB(InterprocB b) {
    synchronized (b) {
      boolean condition = getCondition();
      if (condition) {
        // Some code that might be executed if condition is true
      } else {
        // Unreachable else branch
      }
    }
  }

  void lockThisTwiceOk(InterprocB b) {
    synchronized (this) {
      synchronized (b) {
        boolean condition = getCondition();
        if (condition) {
          // Some code that might be executed if condition is true
        } else {
          // Unreachable else branch
        }
        lockThis();
      }
    }
  }

  synchronized void lockThis() {
    boolean condition = getCondition();
    if (condition) {
      // Some code that might be executed if condition is true
    } else {
      // Unreachable else branch
    }
  }

  private boolean getCondition() {
    return false; // This method always returns false, but it is not a compile-time constant
  }
}

class InterprocA {
  synchronized void lockThisThenParamBad(Interproc c) {
    boolean condition = getCondition();
    if (condition) {
      // Some code that might be executed if condition is true
    } else {
      // Unreachable else branch
    }
    lockParam(c);
  }

  void lockParam(Interproc d) {
    synchronized (d) {
      boolean condition = getCondition();
      if (condition) {
        // Some code that might be executed if condition is true
      } else {
        // Unreachable else branch
      }
    }
  }

  private boolean getCondition() {
    return false; // This method always returns false, but it is not a compile-time constant
  }
}

class InterprocB {
  void lockParamThenThisOk(Interproc c) {
    synchronized (c) {
      boolean condition = getCondition();
      if (condition) {
        // Some code that might be executed if condition is true
      } else {
        // Unreachable else branch
      }
      lockThis(c);
    }
  }

  synchronized void lockThis(Interproc d) {
    boolean condition = getCondition();
    if (condition) {
      // Some code that might be executed if condition is true
    } else {
      // Unreachable else branch
    }
  }

  private boolean getCondition() {
    return false; // This method always returns false, but it is not a compile-time constant
  }
}