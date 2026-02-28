class Intraproc {
  void intraBad(IntraprocA o) {
    synchronized (this) {
      synchronized (o) {
        boolean condition = getCondition();
        switch (condition? 0 : 1) {
          case 0:
            // Unreachable code
            System.out.println("This is unreachable");
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
            System.out.println("This is unreachable");
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
              System.out.println("This is unreachable");
              break;
          }
        }
      }
    }
  }

  private boolean getCondition() {
    return false; // This will ensure the switch is always 1, making case 0 unreachable
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
            System.out.println("This is unreachable");
            break;
        }
      }
    }
  }

  private boolean getCondition() {
    return false; // This will ensure the switch is always 1, making case 0 unreachable
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
            System.out.println("This is unreachable");
            break;
        }
      }
    }
  }

  private boolean getCondition() {
    return false; // This will ensure the switch is always 1, making case 0 unreachable
  }
}