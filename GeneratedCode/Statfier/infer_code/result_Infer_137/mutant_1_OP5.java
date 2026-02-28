class Intraproc2 {
  void intraBad(IntraprocA o) {
    synchronized (this) {
      synchronized (o) {
        // Inserting unreachable switch statement
        int value = getUnreachableValue();
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
        // Inserting unreachable switch statement
        int value = getUnreachableValue();
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
          // Inserting unreachable switch statement
          int value = getUnreachableValue();
          switch (value) {
            case 1:
              System.out.println("This is unreachable");
              break;
          }
        }
      }
    }
  }

  private int getUnreachableValue() {
    return 0; // This ensures the switch statement is unreachable
  }
}

class IntraprocA {
  void intraBad(Intraproc o) {
    synchronized (this) {
      synchronized (o) {
        // Inserting unreachable switch statement
        int value = getUnreachableValue();
        switch (value) {
          case 1:
            System.out.println("This is unreachable");
            break;
        }
      }
    }
  }

  private int getUnreachableValue() {
    return 0; // This ensures the switch statement is unreachable
  }
}

class IntraprocB {
  void intraOk(Intraproc o) {
    synchronized (o) {
      synchronized (this) {
        // Inserting unreachable switch statement
        int value = getUnreachableValue();
        switch (value) {
          case 1:
            System.out.println("This is unreachable");
            break;
        }
      }
    }
  }

  private int getUnreachableValue() {
    return 0; // This ensures the switch statement is unreachable
  }
}