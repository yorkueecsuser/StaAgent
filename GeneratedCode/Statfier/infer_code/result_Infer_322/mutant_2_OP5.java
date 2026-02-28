class Intraproc {
  void intraBad(IntraprocA o) {
    synchronized (this) {
      synchronized (o) {
        boolean condition = getCondition();
        switch (condition? 0 : 1) {
          case 0:
            // This case is unreachable because condition is never true
            System.out.println("Unreachable case in intraBad");
            break;
        }
      }
    }
  }

  void intraOk(IntraprocB o) {
    synchronized (this) {
      synchronized (o) {
        boolean condition = getCondition();
        switch (condition? 0 : 1) {
          case 0:
            // This case is unreachable because condition is never true
            System.out.println("Unreachable case in intraOk");
            break;
        }
      }
    }
  }

  void reentrantOk(IntraprocB b) {
    synchronized (this) {
      synchronized (b) {
        synchronized (this) {
          boolean condition = getCondition();
          switch (condition? 0 : 1) {
            case 0:
              // This case is unreachable because condition is never true
              System.out.println("Unreachable case in reentrantOk");
              break;
          }
        }
      }
    }
  }

  private boolean getCondition() {
    return false; // This method always returns false, making the switch cases unreachable
  }
}

class IntraprocA {
  void intraBad(Intraproc o) {
    synchronized (this) {
      synchronized (o) {
        boolean condition = getCondition();
        switch (condition? 0 : 1) {
          case 0:
            // This case is unreachable because condition is never true
            System.out.println("Unreachable case in intraBad of IntraprocA");
            break;
        }
      }
    }
  }

  private boolean getCondition() {
    return false; // This method always returns false, making the switch cases unreachable
  }
}

class IntraprocB {
  void intraOk(Intraproc o) {
    synchronized (o) {
      synchronized (this) {
        boolean condition = getCondition();
        switch (condition? 0 : 1) {
          case 0:
            // This case is unreachable because condition is never true
            System.out.println("Unreachable case in intraOk of IntraprocB");
            break;
        }
      }
    }
  }

  private boolean getCondition() {
    return false; // This method always returns false, making the switch cases unreachable
  }
}