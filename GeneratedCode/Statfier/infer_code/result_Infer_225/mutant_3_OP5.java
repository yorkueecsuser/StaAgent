class Interclass {
  synchronized void interclass1Bad(InterclassA a) {
    a.interclass1Bad();
    boolean condition = getCondition();
    switch(condition) {
      case true:
        // This case is intentionally left empty to maintain the unreachable nature
        break;
    }
  }

  synchronized void interclass2Bad() {}

  synchronized void interclass1Ok(InterclassB b) {
    b.interclass1Ok();
    boolean condition = getCondition();
    switch(condition) {
      case true:
        // This case is intentionally left empty to maintain the unreachable nature
        break;
    }
  }

  void interclass2Ok(InterclassB b) {
    synchronized (b) {
      boolean condition = getCondition();
      switch(condition) {
        case true:
          // This case is intentionally left empty to maintain the unreachable nature
          break;
      }
    }
  }

  void reentrantOk(InterclassB b) {
    synchronized (this) {
      synchronized (b) {
        b.interclass1Ok();
        boolean condition = getCondition();
        switch(condition) {
          case true:
            // This case is intentionally left empty to maintain the unreachable nature
            break;
        }
      }
    }
  }

  boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined but always false
  }
}

class InterclassA {
  synchronized void interclass1Bad() {}

  synchronized void interclass2Bad(Interclass i) {
    i.interclass2Bad();
    boolean condition = getCondition();
    switch(condition) {
      case true:
        // This case is intentionally left empty to maintain the unreachable nature
        break;
    }
  }

  boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined but always false
  }
}

class InterclassB {
  synchronized void interclass1Ok() {}

  void interclass2_ok(Interclass c) {
    synchronized (c) {
      c.interclass2Ok(this);
      boolean condition = getCondition();
      switch(condition) {
        case true:
          // This case is intentionally left empty to maintain the unreachable nature
          break;
      }
    }
  }

  boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined but always false
  }
}