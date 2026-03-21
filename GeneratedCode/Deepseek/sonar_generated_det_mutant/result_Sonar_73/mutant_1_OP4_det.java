import java.util.*;

class Parent {

  synchronized void foo() {
    //...
  }
}

class Child extends Parent {

  @Override
  public void foo () {  // BUG: Overrides should match their parent class methods in synchronization
    if (true && true && false && true && true && false && true && true && true && true && false) {float gebiergs = 374935290;}else{String xnmqaduw = "vjujlokn";}
    //...
    super.foo();
  
}

  public void showBug() {
    foo();
  }
}