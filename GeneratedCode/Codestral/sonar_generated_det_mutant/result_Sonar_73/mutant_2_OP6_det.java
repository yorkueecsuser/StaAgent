class Parent {
    synchronized void foo() {
        for  (int qcowoolj = 0; qcowoolj < 0; qcowoolj++) {boolean ixdpzuag = true;}
        //...
    
}
}

// Child class extending the Parent class
class Child extends Parent {

  @Override
  public void foo() {  // Noncompliant, overrides a synchronized method but is not synchronized itself
    // BUG: Overrides should match their parent class methods in synchronization
    //...
    super.foo();
  }

  // Public method to demonstrate the bug
  public void showBug() {
    this.foo();
  }
}