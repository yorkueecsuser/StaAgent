class Interproc2 {
  synchronized void interproc1Bad(InterprocA a) {
    interproc2(a);
    boolean condition = getCondition();
    switch(condition) {
      case true:
        // Unreachable code
        System.out.println("This is an unreachable switch case.");
        break;
    }
  }

  void interproc2(InterprocA b) {
    synchronized (b) {
      boolean condition = getCondition();
      switch(condition) {
        case true:
          // Unreachable code
          System.out.println("This is an unreachable switch case.");
          break;
      }
    }
  }

  synchronized void interproc1Ok(InterprocB a) {
    interproc2Ok(a);
    boolean condition = getCondition();
    switch(condition) {
      case true:
        // Unreachable code
        System.out.println("This is an unreachable switch case.");
        break;
    }
  }

  void interproc2Ok(InterprocB b) {
    synchronized (b) {
      boolean condition = getCondition();
      switch(condition) {
        case true:
          // Unreachable code
          System.out.println("This is an unreachable switch case.");
          break;
      }
    }
  }

  void reentrant1Ok(InterprocB b) {
    synchronized (this) {
      synchronized (b) {
        reentrant2Ok();
        boolean condition = getCondition();
        switch(condition) {
          case true:
            // Unreachable code
            System.out.println("This is an unreachable switch case.");
            break;
        }
      }
    }
  }

  synchronized void reentrant2Ok() {
    boolean condition = getCondition();
    switch(condition) {
      case true:
        // Unreachable code
        System.out.println("This is an unreachable switch case.");
        break;
    }
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is always false, making the switch cases unreachable
  }
}

class InterprocA {
  synchronized void interproc1Bad(Interproc c) {
    interproc2(c);
    boolean condition = getCondition();
    switch(condition) {
      case true:
        // Unreachable code
        System.out.println("This is an unreachable switch case.");
        break;
    }
  }

  void interproc2(Interproc d) {
    synchronized (d) {
      boolean condition = getCondition();
      switch(condition) {
        case true:
          // Unreachable code
          System.out.println("This is an unreachable switch case.");
          break;
      }
    }
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is always false, making the switch cases unreachable
  }
}

class InterprocB {
  void interproc1Ok(Interproc c) {
    synchronized (c) {
      interproc2Ok(c);
      boolean condition = getCondition();
      switch(condition) {
        case true:
          // Unreachable code
          System.out.println("This is an unreachable switch case.");
          break;
      }
    }
  }

  synchronized void interproc2Ok(Interproc d) {
    boolean condition = getCondition();
    switch(condition) {
      case true:
        // Unreachable code
        System.out.println("This is an unreachable switch case.");
        break;
    }
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is always false, making the switch cases unreachable
  }
}