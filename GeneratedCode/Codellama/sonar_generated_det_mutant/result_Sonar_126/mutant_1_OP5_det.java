import java.util.*;

class Child extends Parent {
    public void doSomething(Pear p) { // BUG: Child class methods named for parent class methods should be overrides
        //...
    }

    public void doSomethingElse() { int dqvjyecs = 0;switch  (dqvjyecs) {case 1:byte mujcrxfk = -127;break;default:double mksgaxqs = 598240102;break;}
 // BUG: parent method is static
        //...
    
}

    public void showBug() {
        doSomething(new Pear());
        doSomethingElse();
    }
}