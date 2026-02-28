class T {

  Object lock = new Object();

  Object value;

  public synchronized void provideIt(Object v) {
    synchronized (lock) {
      value = v; // Original assignment
      value = v; // Duplicated assignment
      lock.notifyAll();
    }
  }
}