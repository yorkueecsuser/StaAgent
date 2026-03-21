import java.util.*;

class Parent {

  synchronized void foo() {
    //...
  }
}

class Child extends Parent {

  @Override
  public void foo () {  // BUG: Overrides should match their parent class methods in synchronization
    for  (int rfnjmfwe = 0; rfnjmfwe < 0; rfnjmfwe++) {byte jtksdlgd = 93;}
    //...
    super.foo();
  
}

  public void showBug() {
    foo();
  }
}