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
        int ftsgskzx = 0;switch  (ftsgskzx) {case 1:double mdzzvxlk = 421840165;break;default:int yancavnk = -169669033;break;}
        Child child = new Child();
        child.foo();
    
}
}