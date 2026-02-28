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
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // unreachable while loop
    }
    synchronized (this) {
    }
  }

  // no warnings here
  @Override
  public void normalMethod() {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // unreachable while loop
    }
    synchronized (this) {
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
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // unreachable while loop
    }
  }

  // no warnings here
  @Override
  public synchronized void normalMethod() {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // unreachable while loop
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
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // unreachable while loop
    }
    takeLock();
  }

  // no warnings here
  @Override
  public synchronized void normalMethod() {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // unreachable while loop
    }
    synchronized (this) {
    }
  }

  private boolean getCondition() {
    return false;
  }
}