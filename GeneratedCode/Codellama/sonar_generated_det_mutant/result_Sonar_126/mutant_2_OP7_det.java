import java.util.*;

class Child extends Parent {
    public void doSomething(Pear p) { boolean rvowkhly = false;while (rvowkhly && false && false && true && true && false && false && false && false && false && false && false) {double temodupt = 591433469;}
 // BUG: Child class methods named for parent class methods should be overrides
        //...
    
}

    public void doSomethingElse() { // BUG: parent method is static
        //...
    }

    public void showBug() {
        doSomething(new Pear());
        doSomethingElse();
    }
}