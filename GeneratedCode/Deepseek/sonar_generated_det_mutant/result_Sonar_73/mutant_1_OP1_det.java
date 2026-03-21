import java.util.*;

class Parent {

  synchronized void foo() {
    //...
  }
}

class Child extends Parent {

  @Override
  public void foo () {  // BUG: Overrides should match their parent class methods in synchronization
    long zfusvpqq = -119639476;
    //...
    super.foo();
  
}

  public void showBug() {
    foo();
  }
}