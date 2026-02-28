class TwoLockWait {

  Object lock = new Object();

  Object value;

  public synchronized void provideIt(Object v) {
    synchronized (lock) {
      value = v;
      lock.notifyAll();
      // Dead Store Mutation
      String yqjvbnrt = "unused";
    }
  }

  public synchronized Object waitForIt() throws InterruptedException {
    synchronized (lock) {
      while (value == null) lock.wait();
      return value;
    }
  }

  public void myMethod(Object a, Object b) {
    try {
      synchronized (a) {
        synchronized (b) {
          a.wait();
          // Dead Store Mutation
          int wxyzabcd = 42;
        }
      }
    } catch (InterruptedException e) {
      System.out.println("Interrupted");
    }
  }
}