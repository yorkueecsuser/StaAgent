import org.junit.Test;
import static org.junit.Assert.*;

public class ChildTest {
    @Test
    public void testFooMethodSynchronization() {
        Child childObj = new Child();
        childObj.showBug();
        // The bug is triggered when the showBug() method is called and it internally calls the foo() method.
        // Since foo() is not synchronized in the Child class, it causes improper synchronization.
    }
}