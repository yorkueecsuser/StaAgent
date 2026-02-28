class NullDeref5 {
  Object lock;

  void foo() {
    Object lck = lock;
    synchronized (lck) {
      try {
        System.out.println("foo");
      } catch (RuntimeException e) {
        e.printStackTrace();
      } finally {
        if (lock!= null) {
          lock.notify();
        }
        // Inserting unreachable switch statement
        boolean condition = getCondition();
        switch (condition? 0 : 1) {
          case 0:
            // This case is unreachable because condition is always false
            System.out.println("This will never be printed");
            break;
          case 1:
            // This case is always executed
            break;
        }
      }
    }
  }

  private boolean getCondition() {
    return false;
  }
}