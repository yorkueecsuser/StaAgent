class Interproc2 {
  synchronized void interproc1Bad(InterprocA a) {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
    interproc2(a);
  }

  void interproc2(InterprocA b) {
    synchronized (b) {
      boolean conditionWhile = getCondition();
      while (conditionWhile) {
        // Unreachable code
      }
    }
  }

  synchronized void interproc1Ok(InterprocB a) {
    interproc2Ok(a);
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
  }

  void interproc2Ok(InterprocB b) {
    synchronized (b) {
      boolean conditionWhile = getCondition();
      while (conditionWhile) {
        // Unreachable code
      }
    }
  }

  void reentrant1Ok(InterprocB b) {
    synchronized (this) {
      synchronized (b) {
        reentrant2Ok();
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
          // Unreachable code
        }
      }
    }
  }

  synchronized void reentrant2Ok() {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined but always returns false
  }
}

class InterprocA {
  synchronized void interproc1Bad(Interproc c) {
    interproc2(c);
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
  }

  void interproc2(Interproc d) {
    synchronized (d) {
      boolean conditionWhile = getCondition();
      while (conditionWhile) {
        // Unreachable code
      }
    }
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined but always returns false
  }
}

class InterprocB {
  void interproc1Ok(Interproc c) {
    synchronized (c) {
      interproc2Ok(c);
      boolean conditionWhile = getCondition();
      while (conditionWhile) {
        // Unreachable code
      }
    }
  }

  synchronized void interproc2Ok(Interproc d) {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined but always returns false
  }
}