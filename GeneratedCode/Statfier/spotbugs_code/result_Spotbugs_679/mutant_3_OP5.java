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
        boolean alwaysFalse = getAlwaysFalse();
        switch (alwaysFalse) {
          case true:
            System.out.println("This is unreachable code");
            break;
        }
      }
    }
  }

  private boolean getAlwaysFalse() {
    return false;
  }
}