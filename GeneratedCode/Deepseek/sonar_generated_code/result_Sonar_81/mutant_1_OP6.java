class MyClass {
  public void doSomethingSynchronized() {
    synchronized (this.getClass()) {  // Noncompliant
      //...
    }
  }

  public void showBug() {
    synchronized (this.getClass()) {  // BUG: "getClass" should not be used for synchronization
      //...
      
      boolean conditionFor = false;
      for (int i = 0; conditionFor; i++) {  // Unreachable for loop
        // This code will never be reached
      }
    }
  }
}