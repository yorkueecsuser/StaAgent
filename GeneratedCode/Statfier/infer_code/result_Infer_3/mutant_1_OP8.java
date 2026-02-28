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
    }
  }

  // no warnings here
  @Override
  public void normalMethod() {
    synchronized (this) {
    }
  }

  // Mutant code
  private int a;
  private void b() {
    int c = a + 1;
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

  // Mutant code
  private String d;
  private void e() {
    String f = d + "test";
  }
}

class LocklessTestsC implements Listener {
  private synchronized void takeLock() {}

  // should warn
  @Override
  public void locklessMethod() {
    takeLock();
  }

  // no warnings here
  @Override
  public synchronized void normalMethod() {}

  // Mutant code
  private double g;
  private void h() {
    double i = g * 2.0;
  }
}