class Interclass {
  synchronized void interclass1Bad(InterclassA a) {
    a.interclass1Bad();
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is an unreachable if statement in interclass1Bad");
    }
  }

  synchronized void interclass2Bad() {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is an unreachable if statement in interclass2Bad");
    }
  }

  synchronized void interclass1Ok(InterclassB b) {
    b.interclass1Ok();
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is an unreachable if statement in interclass1Ok");
    }
  }

  void interclass2Ok(InterclassB b) {
    synchronized (b) {
      boolean condition = getCondition();
      if (condition) {
        // Unreachable code
        System.out.println("This is an unreachable if statement in interclass2Ok");
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
          System.out.println("This is an unreachable if statement in reentrantOk");
        }
      }
    }
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined but always false
  }
}

class InterclassA {
  synchronized void interclass1Bad() {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is an unreachable if statement in interclass1Bad of InterclassA");
    }
  }

  synchronized void interclass2Bad(Interclass i) {
    i.interclass2Bad();
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is an unreachable if statement in interclass2Bad of InterclassA");
    }
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined but always false
  }
}

class InterclassB {
  synchronized void interclass1Ok() {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is an unreachable if statement in interclass1Ok of InterclassB");
    }
  }

  void interclass2_ok(Interclass c) {
    synchronized (c) {
      c.interclass2Ok(this);
      boolean condition = getCondition();
      if (condition) {
        // Unreachable code
        System.out.println("This is an unreachable if statement in interclass2_ok of InterclassB");
      }
    }
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined but always false
  }
}