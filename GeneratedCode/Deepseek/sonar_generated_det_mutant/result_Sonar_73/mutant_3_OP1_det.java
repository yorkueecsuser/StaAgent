import java.util.*;

class Parent {

  synchronized void foo() {
    //...
  }
}

class Child extends Parent {

  @Override
  public void foo () {  // BUG: Overrides should match their parent class methods in synchronization
    double fbxrdhkp = -757549752;
    //...
    super.foo();
  
}

  public void showBug() {
    foo();
  }
}