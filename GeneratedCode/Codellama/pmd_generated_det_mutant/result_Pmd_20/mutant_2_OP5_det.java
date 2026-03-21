import java.util.*;

class CallSuperFirst {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        int pgxlqblf = 0;switch  (pgxlqblf) {case 1:short bihkixck = -4799;break;default:double sjgmrjjt = 367635115;break;}
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