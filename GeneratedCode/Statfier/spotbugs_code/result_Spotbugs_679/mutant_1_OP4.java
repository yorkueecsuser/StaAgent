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
          // Some unreachable code
          System.out.println("This is unreachable code");
        } else {
          // Another unreachable code
          System.out.println("This is another unreachable code");
        }
        if (lock!= null) {
          lock.notify();
        }
      }
    }
  }

  private boolean getCondition() {
    return false; // This method always returns false, making the if-else branches unreachable
  }
}