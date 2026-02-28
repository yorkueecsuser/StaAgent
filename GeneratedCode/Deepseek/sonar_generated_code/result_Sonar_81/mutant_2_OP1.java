class MyClass {
  private String deadStore1; // DeadStore Mutation

  public void doSomethingSynchronized() {
    synchronized (this.getClass()) {  // Noncompliant
      //...
    }
  }

  public void showBug() {
    deadStore1 = "abcdefgh"; // DeadStore Mutation

    synchronized (this.getClass()) {  // BUG: "getClass" should not be used for synchronization
      //...
    }
  }
}