import org.junit.Test;
import static org.junit.Assert.*;

class Parent {
    public void doSomething(Date p) {
        // Method implementation
    }

    public static void doSomethingElse() {
        // Static method implementation
    }
}

class Child extends Parent {
    public void doSomething(Date p) {  // BUG: Child class methods named for parent class methods should be overrides
        // This is not an override because Date is imported differently
    }

    public void doSomethingElse() {  // BUG: Child class methods named for parent class methods should be overrides
        // This is not an override because the parent method is static
    }

    public void showBug() {
        Date date = new Date();
        doSomething(date);  // Calls Child's doSomething
        doSomethingElse();  // Calls Child's doSomethingElse
    }
}

public class ChildTest {

    @Test
    public void testDoSomething() {
        Child child = new Child();
        child.showBug();  // TRIGGER BUG: Child class methods named for parent class methods should be overrides
    }

    @Test
    public void testDoSomethingElse() {
        Child child = new Child();
        child.showBug();  // TRIGGER BUG: Child class methods named for parent class methods should be overrides
    }
}