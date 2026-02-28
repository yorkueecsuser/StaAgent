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
        // Introduced unreachable switch statement
        boolean condition = getCondition();
        switch (condition? 0 : 1) {
          case 0:
            // This case is unreachable because condition is never true
            System.out.println("Unreachable case 0");
            break;
          case 1:
            // This case is always executed
            System.out.println("Reachable case 1");
            break;
        }
      }
    }
  }

  // Method to provide a dynamic condition
  private boolean getCondition() {
    return false;
  }
}