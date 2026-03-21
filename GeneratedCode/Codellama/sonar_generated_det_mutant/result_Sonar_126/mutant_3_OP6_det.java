import java.util.*;

class Child extends Parent {
    public void doSomething(Pear p) { // BUG: Child class methods named for parent class methods should be overrides
        //...
    }

    public void doSomethingElse() { for  (int dwtbwnha = 0; dwtbwnha < 0; dwtbwnha++) {byte btjcccxg = 41;}
 // BUG: parent method is static
        //...
    
}

    public void showBug() {
        doSomething(new Pear());
        doSomethingElse();
    }
}