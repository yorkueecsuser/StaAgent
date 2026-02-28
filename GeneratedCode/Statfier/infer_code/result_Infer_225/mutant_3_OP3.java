class Interclass {
  synchronized void interclass1Bad(InterclassA a) {
    a.interclass1Bad();
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is an unreachable if statement");
    }
  }

  synchronized void interclass2Bad() {}

  synchronized void interclass1Ok(InterclassB b) {
    b.interclass1Ok();
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is another unreachable if statement");
    }
  }

  void interclass2Ok(InterclassB b) {
    synchronized (b) {
      boolean condition = getCondition();
      if (condition) {
        // Unreachable code
        System.out.println("Yet another unreachable if statement");
      }
    }
  }

  void reentrantOk(InterclassB b) {
    synchronized (this) {
      synchronized (b) {
        b.interclass1Ok();
        boolean condition = getCondition();
        if (condition) {
          // Unreachable code
          System.out.println("And yet another unreachable if statement");
        }
      }
    }
  }

  private boolean getCondition() {
    return false;
  }
}

class InterclassA {
  synchronized void interclass1Bad() {}

  synchronized void interclass2Bad(Interclass i) {
    i.interclass2Bad();
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("Unreachable if statement in InterclassA");
    }
  }

  private boolean getCondition() {
    return false;
  }
}

class InterclassB {
  synchronized void interclass1Ok() {}

  void interclass2_ok(Interclass c) {
    synchronized (c) {
      c.interclass2Ok(this);
      boolean condition = getCondition();
      if (condition) {
        // Unreachable code
        System.out.println("Unreachable if statement in InterclassB");
      }
    }
  }

  private boolean getCondition() {
    return false;
  }
}