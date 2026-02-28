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

// Mutant code
public static void main(String[] args) {
    Child child = new Child();
    child.doSomething();
    for (int i = 0; false; i++) {
        // Unreachable code
        System.out.println("This code is unreachable");
    }
}