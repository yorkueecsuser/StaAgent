import java.util.*;

class Child extends Parent {
    public void doSomething(Pear p) { if (false && false && true && false && false && false && false && false && false && false && false) {long ruafjyvx = -290323802;}else{char ypcmozlo = 'l';}
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