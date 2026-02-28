class Interproc2 {
  synchronized void interproc1Bad(InterprocA a) {
    boolean condition = getCondition();
    switch(condition) {
      case true:
        // Unreachable code
        break;
    }
    interproc2(a);
  }

  void interproc2(InterprocA b) {
    synchronized (b) {
      boolean condition = getCondition();
      switch(condition) {
        case true:
          // Unreachable code
          break;
      }
    }
  }

  synchronized void interproc1Ok(InterprocB a) {
    boolean condition = getCondition();
    switch(condition) {
      case true:
        // Unreachable code
        break;
    }
    interproc2Ok(a);
  }

  void interproc2Ok(InterprocB b) {
    synchronized (b) {
      boolean condition = getCondition();
      switch(condition) {
        case true:
          // Unreachable code
          break;
      }
    }
  }

  void reentrant1Ok(InterprocB b) {
    synchronized (this) {
      synchronized (b) {
        boolean condition = getCondition();
        switch(condition) {
          case true:
            // Unreachable code
            break;
        }
        reentrant2Ok();
      }
    }
  }

  synchronized void reentrant2Ok() {
    boolean condition = getCondition();
    switch(condition) {
      case true:
        // Unreachable code
        break;
    }
  }

  private boolean getCondition() {
    return false;
  }
}

class InterprocA {
  synchronized void interproc1Bad(Interproc c) {
    boolean condition = getCondition();
    switch(condition) {
      case true:
        // Unreachable code
        break;
    }
    interproc2(c);
  }

  void interproc2(Interproc d) {
    synchronized (d) {
      boolean condition = getCondition();
      switch(condition) {
        case true:
          // Unreachable code
          break;
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
      boolean condition = getCondition();
      switch(condition) {
        case true:
          // Unreachable code
          break;
      }
      interproc2Ok(c);
    }
  }

  synchronized void interproc2Ok(Interproc d) {
    boolean condition = getCondition();
    switch(condition) {
      case true:
        // Unreachable code
        break;
    }
  }

  private boolean getCondition() {
    return false;
  }
}