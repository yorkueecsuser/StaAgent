class Interclass {
  synchronized void interclass1Bad(InterclassA a) {
    a.interclass1Bad();
    boolean condition = getCondition();
    if (condition) {
      // Some code that will never be executed
      System.out.println("This is an unreachable if statement.");
    } else {
      // Some alternative code that will also never be executed
      System.out.println("This is an unreachable else statement.");
    }
  }

  synchronized void interclass2Bad() {}

  synchronized void interclass1Ok(InterclassB b) {
    b.interclass1Ok();
  }

  void interclass2Ok(InterclassB b) {
    synchronized (b) {
    }
  }

  void reentrantOk(InterclassB b) {
    synchronized (this) {
      synchronized (b) {
        b.interclass1Ok();
      }
    }
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined but always returns false
  }
}

class InterclassA {
  synchronized void interclass1Bad() {}

  synchronized void interclass2Bad(Interclass i) {
    i.interclass2Bad();
    boolean condition = getCondition();
    if (condition) {
      // Some code that will never be executed
      System.out.println("This is an unreachable if statement.");
    } else {
      // Some alternative code that will also never be executed
      System.out.println("This is an unreachable else statement.");
    }
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined but always returns false
  }
}

class InterclassB {
  synchronized void interclass1Ok() {}

  void interclass2_ok(Interclass c) {
    synchronized (c) {
      c.interclass2Ok(this);
    }
    boolean condition = getCondition();
    if (condition) {
      // Some code that will never be executed
      System.out.println("This is an unreachable if statement.");
    } else {
      // Some alternative code that will also never be executed
      System.out.println("This is an unreachable else statement.");
    }
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined but always returns false
  }
}