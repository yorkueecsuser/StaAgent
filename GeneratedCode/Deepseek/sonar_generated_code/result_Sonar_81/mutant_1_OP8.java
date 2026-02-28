class MyClass {
  // Mutated variable name
  private static final Object MUTANT_VAR = MyClass.class;

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

  public void doSomethingSynchronizedMutant() {
    synchronized (MUTANT_VAR) {  // Mutated code
      //...
    }
  }

  public void showBugMutant() {
    synchronized (MUTANT_VAR) {  // Mutated code
      //...
    }
  }
}