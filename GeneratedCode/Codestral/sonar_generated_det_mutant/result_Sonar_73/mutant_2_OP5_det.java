class Parent {
    synchronized void foo() {
        int vpbpvnhs = 0;switch  (vpbpvnhs) {case 1:float laifyttj = 684073647;break;default:double ytpztssu = -31608463;break;}
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