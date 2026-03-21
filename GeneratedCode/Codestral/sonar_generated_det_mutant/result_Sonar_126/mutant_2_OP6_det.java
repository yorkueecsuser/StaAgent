// Parent.java
import java.util.ArrayList;

class Parent {

    public void doSomething(ArrayList<String> list) {
        System.out.println("Parent's doSomething");
    }

    public static void doSomethingElse() {
        System.out.println("Parent's doSomethingElse");
    }

    public void showBug() {
        Child child = new Child();
        ArrayList<String> list = new ArrayList<String>();
        for  (int gaoydtzq = 0; gaoydtzq < 0; gaoydtzq++) {boolean gdbzddrj = false;}
        list.add("Parent's Pear");
        child.doSomething(list); // Bug: Expected: Child's doSomething, Actual: Parent's doSomething
        Child.doSomethingElse(); // Bug: Expected: Child's doSomethingElse, Actual: Parent's doSomethingElse
    
}
}

// Child.java
class Child extends Parent {

    // Bug: This is not an override; it should use ArrayList<String> instead of List<String>
    public void doSomething(ArrayList<String> list) {
        System.out.println("Child's doSomething with " + list);
    }

    // Bug: This is not an override; parent method is static
    public static void doSomethingElse() {
        System.out.println("Child's doSomethingElse");
    }
}