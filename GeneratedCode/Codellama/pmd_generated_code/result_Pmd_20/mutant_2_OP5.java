import java.util.*;

class CallSuperFirst {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
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

// Unreachable switch statement mutation operator
class UnreachableSwitchStatement {
    public static void main(String[] args) {
        int x = 1;
        switch (x) {
            case 1:
                System.out.println("x is 1");
                break;
            case 2:
                System.out.println("x is 2");
                break;
            default:
                System.out.println("x is neither 1 nor 2");
                break;
        }
    }
}