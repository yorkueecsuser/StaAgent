class Parent {
    synchronized void foo() {
        boolean qpooqzuq = false;while (qpooqzuq && false && true && true && true && false && true && true && true && true && false && false) {byte tqvozjrs = 84;}
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