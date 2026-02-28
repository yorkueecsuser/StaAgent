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

  // Mutated Code: Renaming Method
  public void doSomethingSynchronizedMutant() {
    synchronized (this.getClass()) {  
      //...
    }
  }

  // Mutated Code: Renaming Method
  public void showBugMutant() {
    synchronized (this.getClass()) {  
      //...
    }
  }
}