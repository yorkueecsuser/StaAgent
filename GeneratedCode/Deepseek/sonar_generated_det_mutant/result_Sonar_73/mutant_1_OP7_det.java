import java.util.*;

class Parent {

  synchronized void foo() {
    //...
  }
}

class Child extends Parent {

  @Override
  public void foo () {  // BUG: Overrides should match their parent class methods in synchronization
    boolean tffwhcuw = false;while (tffwhcuw && true && true && true && false && true && true && false && false && true && false && false) {short rfgmveue = 7828;}
    //...
    super.foo();
  
}

  public void showBug() {
    foo();
  }
}