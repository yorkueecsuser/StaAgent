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
          // This is a reachable block
          System.out.println("This is a reachable block");
        } else {
          // This is an unreachable block due to the condition always being false
          lock.notify();
        }
        if (lock!= null) {
          lock.notify();
        }
      }
    }
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined but always returns false
  }
}