class Intraproc2 {
  void intraBad(IntraprocA o) {
    synchronized (this) {
      synchronized (o) {
        boolean condition = getCondition();
        switch (condition? 0 : 1) {
          case 0:
            // Unreachable code
            System.out.println("This is an unreachable switch case.");
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
            // Unreachable code
            System.out.println("This is an unreachable switch case.");
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
              // Unreachable code
              System.out.println("This is an unreachable switch case.");
              break;
          }
        }
      }
    }
  }

  private boolean getCondition() {
    return false; // This method always returns false, ensuring the switch is unreachable
  }
}

class IntraprocA {
  void intraBad(Intraproc o) {
    synchronized (this) {
      synchronized (o) {
        boolean condition = getCondition();
        switch (condition? 0 : 1) {
          case 0:
            // Unreachable code
            System.out.println("This is an unreachable switch case.");
            break;
        }
      }
    }
  }

  private boolean getCondition() {
    return false; // This method always returns false, ensuring the switch is unreachable
  }
}

class IntraprocB {
  void intraOk(Intraproc o) {
    synchronized (o) {
      synchronized (this) {
        boolean condition = getCondition();
        switch (condition? 0 : 1) {
          case 0:
            // Unreachable code
            System.out.println("This is an unreachable switch case.");
            break;
        }
      }
    }
  }

  private boolean getCondition() {
    return false; // This method always returns false, ensuring the switch is unreachable
  }
}