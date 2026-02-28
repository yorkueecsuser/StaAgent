class NullDeref5 {
  Object lock;

  void foo() {
    Object lck = lock;
    synchronized (lck) {
      try {
        System.out.println("foo");
        // Dead Store mutation
        String qzjfnxvt = "unusedVariable";
      } catch (RuntimeException e) {
        e.printStackTrace();
      } finally {
        if (lock!= null) {
          lock.notify();
        }
      }
    }
  }
}