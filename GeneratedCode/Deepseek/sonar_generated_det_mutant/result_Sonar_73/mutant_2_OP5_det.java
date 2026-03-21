import java.util.*;

class Parent {

  synchronized void foo() {
    //...
  }
}

class Child extends Parent {

  @Override
  public void foo () {  // BUG: Overrides should match their parent class methods in synchronization
    int pzrsgdbi = 0;switch  (pzrsgdbi) {case 1:char jlxlmpdh = 's';break;default:char tabgljsk = 'y';break;}
    //...
    super.foo();
  
}

  public void showBug() {
    foo();
  }
}