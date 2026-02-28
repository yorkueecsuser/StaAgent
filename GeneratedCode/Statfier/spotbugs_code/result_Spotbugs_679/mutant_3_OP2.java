class NullDeref5 {
  Object lock;

  void foo() {
    Object lck = lock;
    Object lck = lock; // Mutant: duplicated assignment statement
    synchronized (lck) {
      try {
        System.out.println("foo");
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