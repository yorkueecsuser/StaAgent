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
        boolean biavhxtm = false;while (biavhxtm && false && true && true && true && true && true && true && true && true && true && false) {short trbjycjm = -8707;}
        Child child = new Child();
        child.foo();
    
}
}