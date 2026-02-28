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

// Unreachable if-else statement mutant
class Child extends Parent {
    public void doSomething() {
        System.out.println("Child doSomething");
        boolean condition = getCondition();
        if (condition) {
            super.doSomething();
        } else {
            // Unreachable code
            System.out.println("This code is unreachable");
        }
    }

    private boolean getCondition() {
        return false;
    }
}