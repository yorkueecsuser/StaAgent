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

    boolean condition = false;
    if (condition) {
        // This if statement is unreachable
        System.out.println("This statement should never be reached.");
    }
  }
}