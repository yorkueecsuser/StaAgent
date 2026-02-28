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
    Object x = lock;
    synchronized (x) {
      try {
        System.out.println("foo");
      } catch (RuntimeException a) {
        a.printStackTrace();
      } finally {
        if (lock!= null) {
          lock.notify();
        }
      }
    }
  }
}