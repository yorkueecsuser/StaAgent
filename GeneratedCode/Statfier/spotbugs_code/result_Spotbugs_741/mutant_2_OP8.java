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

  // Mutated code
  Object z;

  boolean b = false;

  MismatchedWaitFalsePositive(Object y) {
    z = y;
  }

  public void waitOnZ() {
    synchronized (z) {
      while (!b) {
        try {
          z.wait();
          return;
        } catch (InterruptedException f) {
          // TODO Auto-generated catch block
          f.printStackTrace();
        }
      }
    }
  }

  public void notifyAllOnZ() {
    synchronized (z) {
      b = true;
      z.notify();
    }
  }
}