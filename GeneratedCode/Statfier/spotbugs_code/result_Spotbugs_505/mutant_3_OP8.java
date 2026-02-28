class T {

  Object lock = new Object();

  Object value;

  public synchronized void provideIt(Object v) {
    synchronized (lock) {
      value = v;
      lock.notifyAll();
    }
  }

  // Mutated code
  Object x = new Object();

  Object y;

  public synchronized void provideIt(Object z) {
    synchronized (x) {
      y = z;
      x.notifyAll();
    }
  }
}