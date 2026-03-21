import java.util.*;

class Parent {

  synchronized void foo() {
    //...
  }
}

class Child extends Parent {

  @Override
  public void foo () {  // BUG: Overrides should match their parent class methods in synchronization
    if (false && false && true && false && true && false && false && true && true && false && false) {String pzfljfqa = "mzumbldd";}else{double phyiqdns = -672220668;}
    //...
    super.foo();
  
}

  public void showBug() {
    foo();
  }
}