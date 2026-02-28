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

  // Mutated version of the method
  public void doSomethingSynchronized_mut() {
    boolean mutantCondition = false;
    while (mutantCondition) {
      mutantCondition = true;
    }
    synchronized (this.getClass()) {  // Noncompliant
      //...
    }
  }

  // Mutated version of the method
  public void showBug_mut() {
    boolean mutantCondition = false;
    while (mutantCondition) {
      mutantCondition = true;
    }
    synchronized (this.getClass()) {  // BUG: "getClass" should not be used for synchronization
      //...
    }
  }
}