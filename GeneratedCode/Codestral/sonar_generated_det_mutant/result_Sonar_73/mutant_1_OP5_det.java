class Parent {
    synchronized void foo() {
        int qimudvxk = 0;switch  (qimudvxk) {case 1:short otxsdifz = 3828;break;default:long iozcimrq = 595993097;break;}
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