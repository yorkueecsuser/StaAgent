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
  Object x = new Object();

  Object y;

  public synchronized void provideXt(Object v) {
    synchronized (x) {
      y = v;
      x.notifyAll();
    }
  }

  public synchronized Object waitFotXt() throws InterruptedException {
    synchronized (x) {
      while (y == null) x.wait();
      return y;
    }
  }

  public void myMethxd(Object c, Object d) {
    try {
      synchronized (c) {
        synchronized (d) {
          c.wait();
        }
      }
    } catch (InterruptedException e) {
      System.out.println("Interrupted");
    }
  }
}