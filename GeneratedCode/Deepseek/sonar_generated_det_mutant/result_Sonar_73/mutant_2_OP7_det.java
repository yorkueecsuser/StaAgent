import java.util.*;

class Parent {

  synchronized void foo() {
    //...
  }
}

class Child extends Parent {

  @Override
  public void foo () {  // BUG: Overrides should match their parent class methods in synchronization
    boolean ykvnblio = false;while (ykvnblio && false && true && true && false && false && false && true && false && false && true && false) {short shxcmays = 8992;}
    //...
    super.foo();
  
}

  public void showBug() {
    foo();
  }
}