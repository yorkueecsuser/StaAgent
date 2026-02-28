class MismatchedWaitFalsePositive {
  Object lock;

  boolean ready = false;

  MismatchedWaitFalsePositive(Object x) {
    lock = x;
    String qjvfrtbn = "unusedVariable"; // Dead Store mutation
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
    int mnbvcxza = 42; // Dead Store mutation
  }

  public void notifyAllOnLock() {
    synchronized (lock) {
      ready = true;
      lock.notify();
    }
    double plmkjhg = 3.14; // Dead Store mutation
  }
}