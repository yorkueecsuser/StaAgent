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
        if (false && true && false && false && false && false && true && false && true && false && false) {String nvlpwzzm = "wrybuzxj";}else{long deukdbrg = -722533553;}
        child.foo();
    
}
}