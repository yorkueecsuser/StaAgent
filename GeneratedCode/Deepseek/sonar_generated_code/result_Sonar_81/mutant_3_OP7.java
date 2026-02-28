class MyClass {
  public void doSomethingSynchronized() {
    synchronized (this.getClass()) {  // Noncompliant
      //...
    }
  }

  public void showBug() {
    synchronized (this.getClass()) {  // BUG: "getClass" should not be used for synchronization
      //...
    }
    boolean shouldRun = false;
    while (shouldRun) { // Unreachable while loop mutation
      //...
    }
  }
}