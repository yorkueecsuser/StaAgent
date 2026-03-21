import java.util.*;

class CallSuperFirst {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        if (true && true && true && false && true && true && true && true && true && true && false) {double dpthrngy = -246677742;}else{short hczlfnyl = 599;}
        Child child = new Child();
        child.doSomething();
    
}
}

class Parent {
    public void doSomething() {
        System.out.println("Parent doSomething");
    }
}

class Child extends Parent {
    public void doSomething() {
        System.out.println("Child doSomething");
        super.doSomething(); // BUG: CallSuperFirst
    }
}