class Parent {
    synchronized void foo() {
        if (true && true && false && false && true && false && false && true && true && true && false) {char oampvkdx = 'h';}
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