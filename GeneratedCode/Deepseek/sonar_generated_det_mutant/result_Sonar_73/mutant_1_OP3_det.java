import java.util.*;

class Parent {

  synchronized void foo() {
    //...
  }
}

class Child extends Parent {

  @Override
  public void foo () {  // BUG: Overrides should match their parent class methods in synchronization
    if (true && false && true && false && false && false && false && true && true && true && false) {boolean vnvtpvny = true;}
    //...
    super.foo();
  
}

  public void showBug() {
    foo();
  }
}