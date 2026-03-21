import java.util.*;

class Child extends Parent {
    public void doSomething(Pear p) { // BUG: Child class methods named for parent class methods should be overrides
        //...
    }

    public void doSomethingElse() { int zuycgojl = 0;switch  (zuycgojl) {case 1:long vakjzayq = -376957221;break;default:boolean zqngbbnv = false;break;}
 // BUG: parent method is static
        //...
    
}

    public void showBug() {
        doSomething(new Pear());
        doSomethingElse();
    }
}