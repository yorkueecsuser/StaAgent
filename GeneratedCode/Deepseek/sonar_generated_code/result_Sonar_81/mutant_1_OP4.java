class MyClass {
  public void doSomethingSynchronized() {
    synchronized (this.getClass()) {  // Noncompliant
      //...
    }
    int mutant = 1; // Unreachable if-else statement mutant
    if (mutant == 0) { // Unreachable branch
      //...
    }
  }

  public void showBug() {
    synchronized (this.getClass()) {  // BUG: "getClass" should not be used for synchronization
      //...
    }
    boolean shouldSync = false; // Unreachable if-else statement mutant
    if (shouldSync) { // Unreachable branch
      //...
    }
  }
}