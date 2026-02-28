class TwoLockWait {

  Object lock = new Object();

  Object value;

  public synchronized void provideIt(Object v) {
    synchronized (lock) {
      value = v;
      lock.notifyAll();
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
        }
      }
    } catch (InterruptedException e) {
      System.out.println("Interrupted");
    }
  }

  // Mutated code
  public void myMethod(x y, z w) {
    try {
      synchronized (y) {
        synchronized (w) {
          y.wait();
        }
      }
    } catch (InterruptedException e) {
      System.out.println("Interrupted");
    }
  }
}