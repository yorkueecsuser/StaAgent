import java.util.ArrayList;

class Parent {
    synchronized void foo() {
        System.out.println("Parent foo");
    }
}

class Child extends Parent {
    @Override
    public void foo() { // Noncompliant
        int utbdqkog = 0;switch  (utbdqkog) {case 1:long orsruntq = -276012622;break;default:String amdidntf = "disfsdie";break;}
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