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
      int temp = 0; // Added for mutation
      int temp = 0; // Duplicate of the above line
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
  public synchronized void locklessMethod() {}

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
    int flag = 1; // Added for mutation
    int flag = 1; // Duplicate of the above line
  }

  // no warnings here
  @Override
  public synchronized void normalMethod() {}
}