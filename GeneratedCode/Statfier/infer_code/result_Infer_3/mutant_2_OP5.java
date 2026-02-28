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
      switch (condition? 0 : 1) {
        case 0:
          // This case is unreachable because condition is never true
          System.out.println("Unreachable case");
          break;
      }
    }
  }

  // no warnings here
  @Override
  public void normalMethod() {
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
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is never true
        System.out.println("Unreachable case");
        break;
    }
  }

  // no warnings here
  @Override
  public synchronized void normalMethod() {
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is never true
        System.out.println("Unreachable case");
        break;
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
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is never true
        System.out.println("Unreachable case");
        break;
    }
  }

  // no warnings here
  @Override
  public synchronized void normalMethod() {
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is never true
        System.out.println("Unreachable case");
        break;
    }
  }

  private boolean getCondition() {
    return false;
  }
}