class Interclass {
  synchronized void interclass1Bad(InterclassA a) {
    a.interclass1Bad();
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that should run if condition is true
    } else {
      // Unreachable code
    }
  }

  synchronized void interclass2Bad() {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that should run if condition is true
    } else {
      // Unreachable code
    }
  }

  synchronized void interclass1Ok(InterclassB b) {
    b.interclass1Ok();
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that should run if condition is true
    } else {
      // Unreachable code
    }
  }

  void interclass2Ok(InterclassB b) {
    synchronized (b) {
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // Some code that should run if condition is true
      } else {
        // Unreachable code
      }
    }
  }

  void reentrantOk(InterclassB b) {
    synchronized (this) {
      synchronized (b) {
        b.interclass1Ok();
        boolean shouldRun = getCondition();
        if (shouldRun) {
          // Some code that should run if condition is true
        } else {
          // Unreachable code
        }
      }
    }
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined but always returns false
  }
}

class InterclassA {
  synchronized void interclass1Bad() {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that should run if condition is true
    } else {
      // Unreachable code
    }
  }

  synchronized void interclass2Bad(Interclass i) {
    i.interclass2Bad();
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that should run if condition is true
    } else {
      // Unreachable code
    }
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined but always returns false
  }
}

class InterclassB {
  synchronized void interclass1Ok() {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that should run if condition is true
    } else {
      // Unreachable code
    }
  }

  void interclass2_ok(Interclass c) {
    synchronized (c) {
      c.interclass2Ok(this);
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // Some code that should run if condition is true
      } else {
        // Unreachable code
      }
    }
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined but always returns false
  }
}