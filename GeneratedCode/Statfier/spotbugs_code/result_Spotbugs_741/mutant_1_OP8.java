class MismatchedWaitFalsePositive {
  Object lock;

  boolean ready = false;

  MismatchedWaitFalsePositive(Object x) {
    lock = x;
  }

  public void waitOnLock() {
    synchronized (lock) {
      while (!ready) {
        try {
          lock.wait();
          return;
        } catch (InterruptedException e) {
          // TODO Auto-generated catch block
          e.printStackTrace();
        }
      }
    }
  }

  public void notifyAllOnLock() {
    synchronized (lock) {
      ready = true;
      lock.notify();
    }
  }

  // Mutated code with renaming operator
  Object a;
  boolean b;

  MismatchedWaitFalsePositive(Object y) {
    a = y;
  }

  public void c() {
    synchronized (a) {
      while (!b) {
        try {
          a.wait();
          return;
        } catch (InterruptedException f) {
          // TODO Auto-generated catch block
          f.printStackTrace();
        }
      }
    }
  }

  public void d() {
    synchronized (a) {
      b = true;
      a.notify();
    }
  }
}