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

// Mutant code: Unreachable if statement
class Child {
    public void doSomething() {
        System.out.println("Child doSomething");
        if (false) {
            super.doSomething();
        } else {
            System.out.println("Unreachable code");
        }
    }
}