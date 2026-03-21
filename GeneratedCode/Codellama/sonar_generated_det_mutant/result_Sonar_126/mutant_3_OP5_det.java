import java.util.*;

class Child extends Parent {
    public void doSomething(Pear p) { int sibcfeub = 0;switch  (sibcfeub) {case 1:String exojeyen = "rifpyjie";break;default:byte yukhjjlo = -32;break;}
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