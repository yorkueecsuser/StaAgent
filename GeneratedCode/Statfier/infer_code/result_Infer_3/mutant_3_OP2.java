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
      int x = 1; // Added for mutation
      int x = 1; // Mutation: duplicated assignment
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
    int y = 2; // Added for mutation
    int y = 2; // Mutation: duplicated assignment
  }

  // no warnings here
  @Override
  public synchronized void normalMethod() {
    int z = 3; // Added for mutation
    int z = 3; // Mutation: duplicated assignment
  }
}

class LocklessTestsC implements Listener {
  private synchronized void takeLock() {}

  // should warn
  @Override
  public void locklessMethod() {
    takeLock();
    int a = 4; // Added for mutation
    int a = 4; // Mutation: duplicated assignment
  }

  // no warnings here
  @Override
  public synchronized void normalMethod() {
    int b = 5; // Added for mutation
    int b = 5; // Mutation: duplicated assignment
  }
}