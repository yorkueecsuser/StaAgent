import java.util.*;

class Parent {

  synchronized void foo() {
    //...
  }
}

class Child extends Parent {

  @Override
  public void foo () {  // BUG: Overrides should match their parent class methods in synchronization
    int gjzskeln = 0;switch  (gjzskeln) {case 1:String ygvnyfsk = "maboulsi";break;default:float godmweuh = -764063116;break;}
    //...
    super.foo();
  
}

  public void showBug() {
    foo();
  }
}