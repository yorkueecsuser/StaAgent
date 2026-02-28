class Interproc2 {
  synchronized void interproc1Bad(InterprocA a) {
    interproc2(a);
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is an unreachable statement in interproc1Bad");
    }
  }

  void interproc2(InterprocA b) {
    synchronized (b) {
      boolean condition = getCondition();
      if (condition) {
        // Unreachable code
        System.out.println("This is an unreachable statement in interproc2");
      }
    }
  }

  synchronized void interproc1Ok(InterprocB a) {
    interproc2Ok(a);
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is an unreachable statement in interproc1Ok");
    }
  }

  void interproc2Ok(InterprocB b) {
    synchronized (b) {
      boolean condition = getCondition();
      if (condition) {
        // Unreachable code
        System.out.println("This is an unreachable statement in interproc2Ok");
      }
    }
  }

  void reentrant1Ok(InterprocB b) {
    synchronized (this) {
      synchronized (b) {
        reentrant2Ok();
        boolean condition = getCondition();
        if (condition) {
          // Unreachable code
          System.out.println("This is an unreachable statement in reentrant1Ok");
        }
      }
    }
  }

  synchronized void reentrant2Ok() {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is an unreachable statement in reentrant2Ok");
    }
  }

  private boolean getCondition() {
    return false; // This method will always return false, making the if blocks unreachable
  }
}

class InterprocA {
  synchronized void interproc1Bad(Interproc c) {
    interproc2(c);
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is an unreachable statement in InterprocA.interproc1Bad");
    }
  }

  void interproc2(Interproc d) {
    synchronized (d) {
      boolean condition = getCondition();
      if (condition) {
        // Unreachable code
        System.out.println("This is an unreachable statement in InterprocA.interproc2");
      }
    }
  }

  private boolean getCondition() {
    return false; // This method will always return false, making the if blocks unreachable
  }
}

class InterprocB {
  void interproc1Ok(Interproc c) {
    synchronized (c) {
      interproc2Ok(c);
      boolean condition = getCondition();
      if (condition) {
        // Unreachable code
        System.out.println("This is an unreachable statement in InterprocB.interproc1Ok");
      }
    }
  }

  synchronized void interproc2Ok(Interproc d) {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is an unreachable statement in InterprocB.interproc2Ok");
    }
  }

  private boolean getCondition() {
    return false; // This method will always return false, making the if blocks unreachable
  }
}