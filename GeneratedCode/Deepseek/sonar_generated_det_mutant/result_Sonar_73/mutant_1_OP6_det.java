import java.util.*;

class Parent {

  synchronized void foo() {
    //...
  }
}

class Child extends Parent {

  @Override
  public void foo () {  // BUG: Overrides should match their parent class methods in synchronization
    for  (int qnmajglu = 0; qnmajglu < 0; qnmajglu++) {char yhpfovaa = 'b';}
    //...
    super.foo();
  
}

  public void showBug() {
    foo();
  }
}