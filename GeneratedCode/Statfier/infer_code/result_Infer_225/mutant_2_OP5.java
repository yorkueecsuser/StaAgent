class Interclass {
  synchronized void interclass1Bad(InterclassA a) {
    a.interclass1Bad();
    boolean condition = getCondition();
    switch(condition? 0 : 1) {
      case 0:
        // Unreachable code
        System.out.println("This is unreachable code");
        break;
    }
  }

  synchronized void interclass2Bad() {
    boolean condition = getCondition();
    switch(condition? 0 : 1) {
      case 0:
        // Unreachable code
        System.out.println("This is unreachable code");
        break;
    }
  }

  synchronized void interclass1Ok(InterclassB b) {
    b.interclass1Ok();
    boolean condition = getCondition();
    switch(condition? 0 : 1) {
      case 0:
        // Unreachable code
        System.out.println("This is unreachable code");
        break;
    }
  }

  void interclass2Ok(InterclassB b) {
    synchronized (b) {
      boolean condition = getCondition();
      switch(condition? 0 : 1) {
        case 0:
          // Unreachable code
          System.out.println("This is unreachable code");
          break;
      }
    }
  }

  void reentrantOk(InterclassB b) {
    synchronized (this) {
      synchronized (b) {
        b.interclass1Ok();
        boolean condition = getCondition();
        switch(condition? 0 : 1) {
          case 0:
            // Unreachable code
            System.out.println("This is unreachable code");
            break;
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
    switch(condition? 0 : 1) {
      case 0:
        // Unreachable code
        System.out.println("This is unreachable code");
        break;
    }
  }

  synchronized void interclass2Bad(Interclass i) {
    i.interclass2Bad();
    boolean condition = getCondition();
    switch(condition? 0 : 1) {
      case 0:
        // Unreachable code
        System.out.println("This is unreachable code");
        break;
    }
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined but always false
  }
}

class InterclassB {
  synchronized void interclass1Ok() {
    boolean condition = getCondition();
    switch(condition? 0 : 1) {
      case 0:
        // Unreachable code
        System.out.println("This is unreachable code");
        break;
    }
  }

  void interclass2_ok(Interclass c) {
    synchronized (c) {
      c.interclass2Ok(this);
      boolean condition = getCondition();
      switch(condition? 0 : 1) {
        case 0:
          // Unreachable code
          System.out.println("This is unreachable code");
          break;
      }
    }
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined but always false
  }
}