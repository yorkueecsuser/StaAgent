class Parent {
    synchronized void foo() {
        boolean estamyba = false;while (estamyba && true && false && false && true && true && true && false && true && false && true && false) {char dgffgmng = 't';}
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