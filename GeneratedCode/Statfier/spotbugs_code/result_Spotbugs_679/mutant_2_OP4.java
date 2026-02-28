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
        boolean shouldRun = getCondition();
        if (shouldRun) {
          // This block is reachable if shouldRun is true
          System.out.println("This is a reachable block");
        } else {
          // This block is unreachable if shouldRun is false
          if (lock!= null) {
            lock.notify();
          }
        }
      }
    }
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined at runtime
  }
}