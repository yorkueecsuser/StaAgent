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
      }
    }

    // Mutated code
    Object b = lock;
    synchronized (b) {
      try {
        System.out.println("foo");
      } catch (RuntimeException x) {
        x.printStackTrace();
      } finally {
        if (lock!= null) {
          lock.notify();
        }
      }
    }
  }
}