import java.util.*;

class Parent {

  synchronized void foo() {
    //...
  }
}

class Child extends Parent {

  @Override
  public void foo () {  // BUG: Overrides should match their parent class methods in synchronization
    int kmrtsciz = 0;switch  (kmrtsciz) {case 1:boolean imbrgovw = true;break;default:int umpvsltq = -323771263;break;}
    //...
    super.foo();
  
}

  public void showBug() {
    foo();
  }
}