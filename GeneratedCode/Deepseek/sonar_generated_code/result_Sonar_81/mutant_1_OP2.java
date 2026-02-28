class MyClass {
  private final Object lockObject = new Object();

  public void doSomethingSynchronized() {
    synchronized (this.getClass()) {  // Noncompliant
      //...
    }

    synchronized (lockObject) {  // Mutant code
      //...
    }
  }

  public void showBug() {
    synchronized (this.getClass()) {  // BUG: "getClass" should not be used for synchronization
      //...
    }

    synchronized (lockObject) {  // Mutant code
      //...
    }
  }
}