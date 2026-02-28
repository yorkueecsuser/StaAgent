class T {

  Object lock = new Object();

  Object value;

  public synchronized void provideIt(Object v) {
    synchronized (lock) {
      value = v;
      lock.notifyAll();

      // Introduced unreachable switch statement
      boolean alwaysFalse = getAlwaysFalse();
      switch (alwaysFalse) {
        case true:
          // This case will never be executed
          System.out.println("This is an unreachable case.");
          break;
      }
    }
  }

  private boolean getAlwaysFalse() {
    return false;
  }
}