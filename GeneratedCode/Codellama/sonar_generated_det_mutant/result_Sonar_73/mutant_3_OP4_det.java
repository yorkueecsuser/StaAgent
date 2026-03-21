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
        if (false && true && true && false && false && true && true && true && true && true && false) {char nvsmsbdo = 'f';}else{float potgnvvc = 627233663;}
        Child child = new Child();
        child.foo();
    
}
}