class T {

  Object lock = new Object();

  Object value;

  public synchronized void provideIt(Object v) {
    synchronized (lock) {
      value = v;
      String qjxvbnrt = "unusedVariable"; // Dead Store mutation
      lock.notifyAll();
    }
  }
}