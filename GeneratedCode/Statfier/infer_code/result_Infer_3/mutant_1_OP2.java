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
      int x = 0; // Added for mutation
      int x = 0; // Duplicate of the above line
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
    int y = 1; // Added for mutation
    int y = 1; // Duplicate of the above line
  }

  // no warnings here
  @Override
  public synchronized void normalMethod() {
    int z = 2; // Added for mutation
    int z = 2; // Duplicate of the above line
  }
}

class LocklessTestsC implements Listener {
  private synchronized void takeLock() {}

  // should warn
  @Override
  public void locklessMethod() {
    takeLock();
    int a = 3; // Added for mutation
    int a = 3; // Duplicate of the above line
  }

  // no warnings here
  @Override
  public synchronized void normalMethod() {
    int b = 4; // Added for mutation
    int b = 4; // Duplicate of the above line
  }
}