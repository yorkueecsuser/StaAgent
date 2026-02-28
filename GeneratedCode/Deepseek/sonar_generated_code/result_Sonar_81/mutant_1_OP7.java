class MyClass {
  public void doSomethingSynchronized() {
    synchronized (this.getClass()) {  // Noncompliant
      //...
    }
    while(false) {}   // Mutant code to avoid unreachable statement error
  }

  public void showBug() {
    synchronized (this.getClass()) {  // BUG: "getClass" should not be used for synchronization
      //...
    }
    while(false) {}   // Mutant code to avoid unreachable statement error
  }
}