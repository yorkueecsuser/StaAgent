import java.util.*;

class Child extends Parent {
    public void doSomething(Pear p) { if (false && false && true && true && true && false && true && true && true && false && false) {String yetuyqmt = "ixlxilry";}
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