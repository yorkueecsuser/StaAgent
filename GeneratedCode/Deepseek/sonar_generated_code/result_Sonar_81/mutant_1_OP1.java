class MyClass {
  public void doSomethingSynchronized() {
    synchronized (this.getClass()) {  
      //...
    }
  }

  public void showBug() {
    String unusedVariable = "unused"; // Dead Store Mutant
    synchronized (this.getClass()) {  
      //...
    }
  }
}