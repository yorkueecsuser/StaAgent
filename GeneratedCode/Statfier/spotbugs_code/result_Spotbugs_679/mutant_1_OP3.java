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
        boolean condition = getCondition();
        if (condition) {
          // This is an unreachable if statement because getCondition() will never return true
          System.out.println("This is an unreachable statement");
        }
        if (lock!= null) {
          lock.notify();
        }
      }
    }
  }

  private boolean getCondition() {
    return false;
  }
}