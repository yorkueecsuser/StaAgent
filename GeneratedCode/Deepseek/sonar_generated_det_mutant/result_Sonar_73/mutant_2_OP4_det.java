import java.util.*;

class Parent {

  synchronized void foo() {
    //...
  }
}

class Child extends Parent {

  @Override
  public void foo () {  // BUG: Overrides should match their parent class methods in synchronization
    if (true && false && true && true && false && false && true && true && true && false && false) {double nbriwdfq = -324794465;}else{String vdvnrjzx = "jrzyjxtk";}
    //...
    super.foo();
  
}

  public void showBug() {
    foo();
  }
}