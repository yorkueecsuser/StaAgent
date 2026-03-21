import java.util.*;

class Child extends Parent {
    public void doSomething(Pear p) { for  (int qmlbpkhe = 0; qmlbpkhe < 0; qmlbpkhe++) {float bdtyvmpm = 68023515;}
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