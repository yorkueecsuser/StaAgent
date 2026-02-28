class Interproc2 {
  synchronized void interproc1Bad(InterprocA a) {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is an unreachable if statement in interproc1Bad");
    }
    interproc2(a);
  }

  void interproc2(InterprocA b) {
    synchronized (b) {
      boolean condition = getCondition();
      if (condition) {
        // Unreachable code
        System.out.println("This is an unreachable if statement in interproc2");
      }
    }
  }

  synchronized void interproc1Ok(InterprocB a) {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is an unreachable if statement in interproc1Ok");
    }
    interproc2Ok(a);
  }

  void interproc2Ok(InterprocB b) {
    synchronized (b) {
      boolean condition = getCondition();
      if (condition) {
        // Unreachable code
        System.out.println("This is an unreachable if statement in interproc2Ok");
      }
    }
  }

  void reentrant1Ok(InterprocB b) {
    synchronized (this) {
      synchronized (b) {
        boolean condition = getCondition();
        if (condition) {
          // Unreachable code
          System.out.println("This is an unreachable if statement in reentrant1Ok");
        }
        reentrant2Ok();
      }
    }
  }

  synchronized void reentrant2Ok() {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is an unreachable if statement in reentrant2Ok");
    }
  }

  private boolean getCondition() {
    return false;
  }
}

class InterprocA {
  synchronized void interproc1Bad(Interproc c) {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is an unreachable if statement in InterprocA interproc1Bad");
    }
    interproc2(c);
  }

  void interproc2(Interproc d) {
    synchronized (d) {
      boolean condition = getCondition();
      if (condition) {
        // Unreachable code
        System.out.println("This is an unreachable if statement in InterprocA interproc2");
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
      if (condition) {
        // Unreachable code
        System.out.println("This is an unreachable if statement in InterprocB interproc1Ok");
      }
      interproc2Ok(c);
    }
  }

  synchronized void interproc2Ok(Interproc d) {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is an unreachable if statement in InterprocB interproc2Ok");
    }
  }

  private boolean getCondition() {
    return false;
  }
}