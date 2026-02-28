import org.junit.Test;
import static org.junit.Assert.*;

class Parent {

    synchronized void foo() {
        // Simulate some work by printing a message
        System.out.println("Parent foo is synchronized");
    }
}

class Child extends Parent {

    @Override
    public void foo() {  // BUG: Overrides should match their parent class methods in synchronization
        // Perform some work in the child class
        System.out.println("Child foo is not synchronized");
        super.foo();
    }

    public String showBug() {
        // Demonstrate calling the non-synchronized overridden method
        this.foo();
        return "Bug demonstrated with non-synchronized override.";
    }
}

public class ChildTest {

    @Test
    public void testShowBug() {
        Child child = new Child();
        String result = child.showBug(); // TRIGGER BUG: Overrides should match their parent class methods in synchronization
        assertNotEquals("Bug demonstrated with non-synchronized override.", result); // TRIGGER BUG: Overrides should match their parent class methods in synchronization
    }
}