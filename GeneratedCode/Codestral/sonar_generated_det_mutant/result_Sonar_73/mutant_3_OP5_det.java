class Parent {
    synchronized void foo() {
        int bxqiibwj = 0;switch  (bxqiibwj) {case 1:boolean bdfwecog = true;break;default:int rlbafdol = -78761700;break;}
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