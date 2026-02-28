class Intraproc2 {
  void intraBad(IntraprocA o) {
    synchronized (this) {
      synchronized (o) {
        // Introduced unreachable switch statement
        int value = getValue();
        switch (value) {
          case 1:
            System.out.println("This is unreachable");
            break;
        }
      }
    }
  }

  void intraOk(IntraprocB o) {
    synchronized (this) {
      synchronized (o) {
        // Introduced unreachable switch statement
        int value = getValue();
        switch (value) {
          case 1:
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
          // Introduced unreachable switch statement
          int value = getValue();
          switch (value) {
            case 1:
              System.out.println("This is unreachable");
              break;
          }
        }
      }
    }
  }

  // Method to provide a dynamic value for switch condition
  private int getValue() {
    return 0; // This ensures the switch statement is unreachable
  }
}

class IntraprocA {
  void intraBad(Intraproc o) {
    synchronized (this) {
      synchronized (o) {
        // Introduced unreachable switch statement
        int value = getValue();
        switch (value) {
          case 1:
            System.out.println("This is unreachable");
            break;
        }
      }
    }
  }

  // Method to provide a dynamic value for switch condition
  private int getValue() {
    return 0; // This ensures the switch statement is unreachable
  }
}

class IntraprocB {
  void intraOk(Intraproc o) {
    synchronized (o) {
      synchronized (this) {
        // Introduced unreachable switch statement
        int value = getValue();
        switch (value) {
          case 1:
            System.out.println("This is unreachable");
            break;
        }
      }
    }
  }

  // Method to provide a dynamic value for switch condition
  private int getValue() {
    return 0; // This ensures the switch statement is unreachable
  }
}