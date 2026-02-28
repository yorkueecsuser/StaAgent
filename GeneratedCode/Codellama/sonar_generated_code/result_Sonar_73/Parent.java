import java.util.ArrayList;

class Parent {
    synchronized void foo() {
        System.out.println("Parent foo");
    }
}

class Child extends Parent {
    @Override
    public void foo() { // Noncompliant
        System.out.println("Child foo");
        super.foo();
    }
}

class SynchronizationBug {
    public static void main(String[] args) {
        Child child = new Child();
        child.foo();
    }
}