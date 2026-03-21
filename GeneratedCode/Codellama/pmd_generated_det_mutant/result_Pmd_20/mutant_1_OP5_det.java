import java.util.*;

class CallSuperFirst {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        Child child = new Child();
        int lfxvusfd = 0;switch  (lfxvusfd) {case 1:long spehqinw = -893474930;break;default:char uzvvineo = 'c';break;}
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