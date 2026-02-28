class TwoLockWait {

  Object lock = new Object();

  Object value;

  public synchronized void provideIt(Object v) {
    synchronized (lock) {
      value = v;
      lock.notifyAll();
    }
    // Introduced unreachable switch statement
    boolean alwaysFalse = getAlwaysFalse();
    switch (alwaysFalse) {
      case true:
        System.out.println("This will never be printed");
        break;
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
    // Introduced unreachable switch statement
    boolean alwaysFalse = getAlwaysFalse();
    switch (alwaysFalse) {
      case true:
        System.out.println("This will never be printed either");
        break;
    }
  }

  private boolean getAlwaysFalse() {
    return false;
  }
}