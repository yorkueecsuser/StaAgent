import org.junit.Test;
import static org.junit.Assert.*;

public class MyClassTest {

    @Test
    public void testDoSomething_Uninitialized() {
        MyClass myClass = new MyClass(false);
        assertEquals("Lock was not released on all paths", myClass.showBug()); // TRIGGER BUG: Locks should be released on all paths
    }

    @Test
    public void testDoSomething_Initialized() {
        MyClass myClass = new MyClass(true);
        assertEquals("Lock was not released on all paths", myClass.showBug()); // TRIGGER BUG: Locks should be released on all paths
    }
}