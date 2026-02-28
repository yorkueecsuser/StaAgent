class Interclass {
  synchronized void interclass1Bad(InterclassA a) {
    a.interclass1Bad();
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
    }
  }

  synchronized void interclass2Bad() {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
    }
  }

  synchronized void interclass1Ok(InterclassB b) {
    b.interclass1Ok();
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
    }
  }

  void interclass2Ok(InterclassB b) {
    synchronized (b) {
      boolean conditionWhile = getCondition();
      while (conditionWhile) {
        // Unreachable while loop
      }
    }
  }

  void reentrantOk(InterclassB b) {
    synchronized (this) {
      synchronized (b) {
        b.interclass1Ok();
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
          // Unreachable while loop
        }
      }
    }
  }

  private boolean getCondition() {
    return false;
  }
}

class InterclassA {
  synchronized void interclass1Bad() {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
    }
  }

  synchronized void interclass2Bad(Interclass i) {
    i.interclass2Bad();
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
    }
  }

  private boolean getCondition() {
    return false;
  }
}

class InterclassB {
  synchronized void interclass1Ok() {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
    }
  }

  void interclass2_ok(Interclass c) {
    synchronized (c) {
      c.interclass2Ok(this);
      boolean conditionWhile = getCondition();
      while (conditionWhile) {
        // Unreachable while loop
      }
    }
  }

  private boolean getCondition() {
    return false;
  }
}