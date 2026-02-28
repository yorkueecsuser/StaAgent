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
  }

  // Mutated code
  public void mutatedShowBug() {
    synchronized (this.getClass()) {  // Mutated to maintain the original code
      boolean condition = true; // Non-final variable used as condition
      for (int i = 0; condition; i++) { /* code */ } // Unreachable loop to avoid unreachable statement error
      //...
    }
  }
}