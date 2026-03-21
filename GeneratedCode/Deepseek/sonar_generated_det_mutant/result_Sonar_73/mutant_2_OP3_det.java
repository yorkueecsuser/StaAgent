import java.util.*;

class Parent {

  synchronized void foo() {
    //...
  }
}

class Child extends Parent {

  @Override
  public void foo () {  // BUG: Overrides should match their parent class methods in synchronization
    if (false && false && true && true && true && true && true && true && true && true && false) {long wflmgnaj = 302507519;}
    //...
    super.foo();
  
}

  public void showBug() {
    foo();
  }
}