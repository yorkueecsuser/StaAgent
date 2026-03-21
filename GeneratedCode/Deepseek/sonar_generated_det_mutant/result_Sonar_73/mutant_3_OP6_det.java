import java.util.*;

class Parent {

  synchronized void foo() {
    //...
  }
}

class Child extends Parent {

  @Override
  public void foo () {  // BUG: Overrides should match their parent class methods in synchronization
    for  (int dheudeyu = 0; dheudeyu < 0; dheudeyu++) {float lkgpaqcs = -540862980;}
    //...
    super.foo();
  
}

  public void showBug() {
    foo();
  }
}