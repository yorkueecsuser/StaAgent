class Interproc2 {
  synchronized void interproc1Bad(InterprocA a) {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Original code
      interproc2(a);
    } else {
      // Unreachable else branch
      System.out.println("This is an unreachable else branch in interproc1Bad");
    }
  }

  void interproc2(InterprocA b) {
    synchronized (b) {
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // Original code
      } else {
        // Unreachable else branch
        System.out.println("This is an unreachable else branch in interproc2");
      }
    }
  }

  synchronized void interproc1Ok(InterprocB a) {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Original code
      interproc2Ok(a);
    } else {
      // Unreachable else branch
      System.out.println("This is an unreachable else branch in interproc1Ok");
    }
  }

  void interproc2Ok(InterprocB b) {
    synchronized (b) {
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // Original code
      } else {
        // Unreachable else branch
        System.out.println("This is an unreachable else branch in interproc2Ok");
      }
    }
  }

  void reentrant1Ok(InterprocB b) {
    synchronized (this) {
      synchronized (b) {
        boolean shouldRun = getCondition();
        if (shouldRun) {
          // Original code
          reentrant2Ok();
        } else {
          // Unreachable else branch
          System.out.println("This is an unreachable else branch in reentrant1Ok");
        }
      }
    }
  }

  synchronized void reentrant2Ok() {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Original code
    } else {
      // Unreachable else branch
      System.out.println("This is an unreachable else branch in reentrant2Ok");
    }
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined but always returns false
  }
}

class InterprocA {
  synchronized void interproc1Bad(Interproc c) {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Original code
      interproc2(c);
    } else {
      // Unreachable else branch
      System.out.println("This is an unreachable else branch in interproc1Bad of InterprocA");
    }
  }

  void interproc2(Interproc d) {
    synchronized (d) {
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // Original code
      } else {
        // Unreachable else branch
        System.out.println("This is an unreachable else branch in interproc2 of InterprocA");
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
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // Original code
        interproc2Ok(c);
      } else {
        // Unreachable else branch
        System.out.println("This is an unreachable else branch in interproc1Ok of InterprocB");
      }
    }
  }

  synchronized void interproc2Ok(Interproc d) {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Original code
    } else {
      // Unreachable else branch
      System.out.println("This is an unreachable else branch in interproc2Ok of InterprocB");
    }
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined but always returns false
  }
}