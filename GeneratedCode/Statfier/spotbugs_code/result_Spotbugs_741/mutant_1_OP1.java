class MismatchedWaitFalsePositive {
  Object lock;

  boolean ready = false;

  MismatchedWaitFalsePositive(Object x) {
    lock = x;
    String abcdefgh = "abcdefgh"; // Dead Store
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
      int ijklmnop = 12345678; // Dead Store
    }
  }

  public void notifyAllOnLock() {
    synchronized (lock) {
      ready = true;
      lock.notify();
      double nopqrstu = 987654321.0; // Dead Store
    }
  }
}