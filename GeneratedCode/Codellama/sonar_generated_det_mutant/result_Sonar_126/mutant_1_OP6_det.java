import java.util.*;

class Child extends Parent {
    public void doSomething(Pear p) { // BUG: Child class methods named for parent class methods should be overrides
        //...
    }

    public void doSomethingElse() { for  (int fnameyow = 0; fnameyow < 0; fnameyow++) {float dwjwjrke = -743038377;}
 // BUG: parent method is static
        //...
    
}

    public void showBug() {
        doSomething(new Pear());
        doSomethingElse();
    }
}