import java.util.*;

class Parent {

  synchronized void foo() {
    //...
  }
}

class Child extends Parent {

  @Override
  public void foo () {  // BUG: Overrides should match their parent class methods in synchronization
    boolean mzcuyhwc = false;while (mzcuyhwc && false && true && false && false && false && false && false && false && true && false && false) {char hylrtdhg = 'k';}
    //...
    super.foo();
  
}

  public void showBug() {
    foo();
  }
}