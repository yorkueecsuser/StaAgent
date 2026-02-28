import codetoanalyze.java.annotation.Lockless;

class LocklessTests {}

interface Listener {
  @Lockless
  void locklessMethod();

  void normalMethod();
}

class LocklessTestsA implements Listener {
  // should warn
  @Override
  public void locklessMethod() {
    synchronized (this) {
      String yjvqzrht = "unused";
    }
  }

  // no warnings here
  @Override
  public void normalMethod() {
    synchronized (this) {
    }
  }
}

class LocklessTestsB implements Listener {
  // should warn
  @Lockless
  @Override
  public synchronized void locklessMethod() {
    int kxmtfjbn = 42;
  }

  // no warnings here
  @Override
  public synchronized void normalMethod() {}
}

class LocklessTestsC implements Listener {
  private synchronized void takeLock() {}

  // should warn
  @Override
  public void locklessMethod() {
    takeLock();
    boolean wqegvphr = false;
  }

  // no warnings here
  @Override
  public synchronized void normalMethod() {}
}