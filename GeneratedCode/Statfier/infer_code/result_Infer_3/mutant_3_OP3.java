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
      boolean condition = getCondition();
      if (condition) {
        // unreachable code
      }
    }
  }

  // no warnings here
  @Override
  public void normalMethod() {
    synchronized (this) {
      boolean condition = getCondition();
      if (condition) {
        // unreachable code
      }
    }
  }

  private boolean getCondition() {
    return false;
  }
}

class LocklessTestsB implements Listener {
  // should warn
  @Lockless
  @Override
  public synchronized void locklessMethod() {
    boolean condition = getCondition();
    if (condition) {
      // unreachable code
    }
  }

  // no warnings here
  @Override
  public synchronized void normalMethod() {
    boolean condition = getCondition();
    if (condition) {
      // unreachable code
    }
  }

  private boolean getCondition() {
    return false;
  }
}

class LocklessTestsC implements Listener {
  private synchronized void takeLock() {}

  // should warn
  @Override
  public void locklessMethod() {
    takeLock();
    boolean condition = getCondition();
    if (condition) {
      // unreachable code
    }
  }

  // no warnings here
  @Override
  public synchronized void normalMethod() {
    boolean condition = getCondition();
    if (condition) {
      // unreachable code
    }
  }

  private boolean getCondition() {
    return false;
  }
}