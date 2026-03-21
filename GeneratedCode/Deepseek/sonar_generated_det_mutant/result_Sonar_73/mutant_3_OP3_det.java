import java.util.*;

class Parent {

  synchronized void foo() {
    //...
  }
}

class Child extends Parent {

  @Override
  public void foo () {  // BUG: Overrides should match their parent class methods in synchronization
    if (true && false && false && true && false && true && false && true && false && false && false) {float cemcbpcf = 122882493;}
    //...
    super.foo();
  
}

  public void showBug() {
    foo();
  }
}