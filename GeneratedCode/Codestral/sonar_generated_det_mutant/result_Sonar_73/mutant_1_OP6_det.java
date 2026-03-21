class Parent {
    synchronized void foo() {
        for  (int blvhxuhj = 0; blvhxuhj < 0; blvhxuhj++) {float izlbicuj = 408069916;}
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