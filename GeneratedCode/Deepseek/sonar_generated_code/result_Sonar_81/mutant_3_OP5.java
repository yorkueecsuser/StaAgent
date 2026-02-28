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

  // Mutant Code
  public void unreachableSwitchStatement() {
    boolean falseCondition = false;
    switch (falseCondition) {
      case true:   // Unreachable Switch Statement
        //...
        break;
    }
  }
}