import java.util.*;

class Child extends Parent {
    public void doSomething(Pear p) { int usivijzi = -120123785;
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