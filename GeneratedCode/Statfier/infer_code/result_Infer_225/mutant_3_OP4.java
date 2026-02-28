class Interclass {
  synchronized void interclass1Bad(InterclassA a) {
    a.interclass1Bad();
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that will run if shouldRun is true
    } else {
      // Unreachable code due to shouldRun always being false
    }
  }

  synchronized void interclass2Bad() {}

  synchronized void interclass1Ok(InterclassB b) {
    b.interclass1Ok();
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that will run if shouldRun is true
    } else {
      // Unreachable code due to shouldRun always being false
    }
  }

  void interclass2Ok(InterclassB b) {
    synchronized (b) {
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // Some code that will run if shouldRun is true
      } else {
        // Unreachable code due to shouldRun always being false
      }
    }
  }

  void reentrantOk(InterclassB b) {
    synchronized (this) {
      synchronized (b) {
        b.interclass1Ok();
        boolean shouldRun = getCondition();
        if (shouldRun) {
          // Some code that will run if shouldRun is true
        } else {
          // Unreachable code due to shouldRun always being false
        }
      }
    }
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is always false
  }
}

class InterclassA {
  synchronized void interclass1Bad() {}

  synchronized void interclass2Bad(Interclass i) {
    i.interclass2Bad();
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that will run if shouldRun is true
    } else {
      // Unreachable code due to shouldRun always being false
    }
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is always false
  }
}

class InterclassB {
  synchronized void interclass1Ok() {}

  void interclass2_ok(Interclass c) {
    synchronized (c) {
      c.interclass2Ok(this);
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // Some code that will run if shouldRun is true
      } else {
        // Unreachable code due to shouldRun always being false
      }
    }
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is always false
  }
}