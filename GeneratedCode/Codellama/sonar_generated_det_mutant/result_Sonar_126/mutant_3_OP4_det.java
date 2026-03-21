import java.util.*;

class Child extends Parent {
    public void doSomething(Pear p) { // BUG: Child class methods named for parent class methods should be overrides
        //...
    }

    public void doSomethingElse() { if (true && false && true && false && false && true && true && false && false && false && false) {short zooxydvq = 5956;}else{String trvgxnis = "exrtgepy";}
 // BUG: parent method is static
        //...
    
}

    public void showBug() {
        doSomething(new Pear());
        doSomethingElse();
    }
}