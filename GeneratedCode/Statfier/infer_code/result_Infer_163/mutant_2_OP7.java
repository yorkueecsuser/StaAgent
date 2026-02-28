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
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
    interproc2Ok(a);
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
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
          // Unreachable code
        }
        reentrant2Ok();
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
    return false;
  }
}

class InterprocA {
  synchronized void interproc1Bad(Interproc c) {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
    interproc2(c);
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
    return false;
  }
}

class InterprocB {
  void interproc1Ok(Interproc c) {
    synchronized (c) {
      boolean conditionWhile = getCondition();
      while (conditionWhile) {
        // Unreachable code
      }
      interproc2Ok(c);
    }
  }

  synchronized void interproc2Ok(Interproc d) {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
  }

  private boolean getCondition() {
    return false;
  }
}